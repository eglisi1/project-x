package ch.zhaw.infm.springboottemplate.restcontroller;

import ch.zhaw.infm.springboottemplate.repositories.EventRepository;
import ch.zhaw.infm.springboottemplate.repositories.ShowsRepository;
import ch.zhaw.infm.springboottemplate.views.NodeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WP4RestController {
    @Autowired
    EventRepository nodeRepository;
    @Autowired
    ShowsRepository edgeRepository;

    @GetMapping("/nodes")
    public ResponseEntity<List<NodeView>> allNodes() {
        var result = nodeRepository.findAllByEventIdGreaterThan(0L);
        if (!result.isEmpty()) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/edges")
    public ResponseEntity<List<Object[]>> allEdges() {
        var result = edgeRepository.findEdges();
        if (!result.isEmpty()) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
