package de.os.dehaar.dokos_rest_api.controller

import de.os.dehaar.dokos_rest_api.service.PlayerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/players")
class PlayerController(var playerService: PlayerService) {
    
}