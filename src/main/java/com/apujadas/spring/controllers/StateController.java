package com.apujadas.spring.controllers;

import com.apujadas.spring.ServerState;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/state")
public class StateController {

    @PutMapping(path = "/on")
    public void enableServer() {
        ServerState.getInstance().setEnabled(true);
    }

    @PutMapping(path = "/off")
    private void disableServer(){
        ServerState.getInstance().setEnabled(false);
    }

}