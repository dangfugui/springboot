package dang.note.spring.api.controller;

import dang.note.spring.api.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/demo")
@Slf4j
public class DemoController {

    @Autowired
    private DemoService demoService;
    
    @RequestMapping("/echo")
    public String echo(String echo) {
        String res = demoService.echo(echo);
        return res;
    }
}
