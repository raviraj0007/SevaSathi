package org.sewasathi.Controller;


import org.sewasathi.Entity.Worker;
import org.sewasathi.Service.WorkerEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerEntryService workerEntryService;


     @PostMapping
     public ResponseEntity<?> registerWorker(@RequestBody Worker workerentry) {
         workerEntryService.saveWorker(workerentry);
         return new ResponseEntity<>(HttpStatus.CREATED);
     }

}
