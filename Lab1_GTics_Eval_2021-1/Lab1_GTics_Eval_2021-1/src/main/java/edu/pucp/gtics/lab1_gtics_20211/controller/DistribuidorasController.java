package edu.pucp.gtics.lab1_gtics_20211.controller;

import edu.pucp.gtics.lab1_gtics_20211.entity.Distribuidoras;
import edu.pucp.gtics.lab1_gtics_20211.repository.DistribuidorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/distribuidoras")
public class DistribuidorasController {

    @Autowired
    DistribuidorasRepository distribuidorasRepository;

    @GetMapping("/lista")
    public String listaDistribuidoras(Model model) {
        List<Distribuidoras> list = distribuidorasRepository.findAll();

        model.addAttribute("distribuidorasLista", list);
        return "/distribuidoras/lista";
    }

    @GetMapping("/editar")
    public String editarDistribuidoras(@RequestParam("id") int id, Model model) {
        Optional<Distribuidoras> distribuidorasOptional = distribuidorasRepository.findById(id);
        if (distribuidorasOptional.isPresent()) {
            Distribuidoras dis = distribuidorasOptional.get();
            model.addAttribute("distribuidora", dis);
            return "distribuidoras/editar";
        } else {
            return "redirect:/distribuidoras/lista";
        }

    }

    @GetMapping("/nuevo")
    public String nuevaDistribuidora() {
        return "distribuidoras/nuevo";


    }

   @PostMapping("/guardar")
    public String guardarDistribuidora(Distribuidoras distribuidoras) {
       System.out.println("imprimiendo");
       System.out.println(distribuidoras.getNombre());

       System.out.println(distribuidoras.getFundacion());


        distribuidorasRepository.save(distribuidoras);
        return "redirect:/distribuidoras/lista";
    }


    @GetMapping("/borrar")
    public String borrarDistribuidora(@RequestParam("id") int id) {
        Optional<Distribuidoras> distribuidorasOptional = distribuidorasRepository.findById(id);
        if (distribuidorasOptional.isPresent()) {

            distribuidorasRepository.deleteById(id);

        }

        return "redirect:/distribuidoras/lista";

    }

}
