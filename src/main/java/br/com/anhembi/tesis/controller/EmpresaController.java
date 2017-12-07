package br.com.anhembi.tesis.controller;

import br.com.anhembi.tesis.DTO.EventoDTO;
import br.com.anhembi.tesis.DTO.PerfilEmpDTO;
import br.com.anhembi.tesis.DTO.UsuarioDTO;
import br.com.anhembi.tesis.DTO.VagaDTo;
import br.com.anhembi.tesis.entity.Evento;
import br.com.anhembi.tesis.entity.PerfilEmp;
import br.com.anhembi.tesis.entity.Usuario;
import br.com.anhembi.tesis.entity.Vaga;
import br.com.anhembi.tesis.repository.EventoRepository;
import br.com.anhembi.tesis.repository.PerfilEmpRepository;
import br.com.anhembi.tesis.repository.UsuarioRepository;
import br.com.anhembi.tesis.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private static Logger log = Logger.getLogger(EmpresaController.class);

    @Autowired
    VagaRepository repository;

    @Autowired
    PerfilEmpRepository perfilEmpRepository;

    @Autowired
    EventoRepository eventoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping(value = {"/findUsu/{usu}"}, method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable("usu") String usuario){

        return usuarioRepository.findByUsuario(usuario);

    }

    @RequestMapping(value = {"/vaga/find"}, method = RequestMethod.GET)
    public List<Vaga> find(){

        List<Vaga> vaga = repository.findAll();

        log.info("imprimir: " + vaga);

        return repository.findAll();
    }

    @RequestMapping(value = {"/evento/find"}, method = RequestMethod.GET)
    public List<Evento> findEvento(){

        List<Evento> eventos = eventoRepository.findAll();

        log.info("imprimir: " + eventos);

        return eventoRepository.findAll();
    }

    @RequestMapping(value = {"/insert/usu"}, method = RequestMethod.POST)
    public ResponseEntity createUsuario(@RequestBody UsuarioDTO usuario){

        Usuario usu =  new Usuario();

        usu.setId(null);
        usu.setUsuario(usuario.getUsuario());
        usu.setContrasenha(usuario.getContrasenha());
        usu.setEmpresa(usuario.getEmpresa());

        usuarioRepository.save(usu);

        return ResponseEntity.ok(usu);

    }

    @RequestMapping(value = {"/vaga/insert"}, method = RequestMethod.POST)
    public ResponseEntity find(@RequestBody VagaDTo vg){

        Vaga vaga =  new Vaga();

        vaga.setId(null);
        vaga.setDescripcion(vg.getDescripcion());
        vaga.setHorario(vg.getHorario());
        vaga.setLugar(vg.getLugar());
        vaga.setSalario(vg.getSalario());
        vaga.setTitulo(vg.getTitulo());
        vaga.setTipoContrato(vg.getTipoContrato());
        vaga.setDuracao(vg.getDuracao());

        repository.save(vaga);

        return ResponseEntity.ok(vaga);
    }

    @RequestMapping(value = {"/evento/insert"}, method = RequestMethod.POST)
    public ResponseEntity createEvent(@RequestBody EventoDTO ev){

        Evento event =  new Evento();

        event.setId(null);
        event.setData(ev.getData());
        event.setDescricao(ev.getDescricao());
        event.setEndereco(ev.getEndereco());
        event.setHora(ev.getHora());
        event.setTitulo(ev.getTitulo());
        event.setPreco(ev.getPreco());

        eventoRepository.save(event);

        return ResponseEntity.ok(event);
    }

    @RequestMapping(value = {"/perfil/insert"}, method = RequestMethod.POST)
    public ResponseEntity insertPerfil(@RequestBody PerfilEmpDTO perfil){

        PerfilEmp pf = new PerfilEmp();

        pf.setInstituicao(perfil.getInstituicao());
        pf.setCnpj(perfil.getCnpj());
        pf.setTipoEmp(perfil.getTipoEmp());
        pf.setEmail(perfil.getEmail());

        perfilEmpRepository.save(pf);

        return ResponseEntity.ok(pf);
    }

    @RequestMapping(value = {"/delete/vaga/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity deleteVaga(@PathVariable("id") String id){
        repository.delete(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = {"/delete/evento/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity deleteEvento(@PathVariable("id") String id){
        eventoRepository.delete(id);
        return ResponseEntity.ok().build();
    }

}
