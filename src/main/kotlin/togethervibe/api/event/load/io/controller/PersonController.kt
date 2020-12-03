package togethervibe.api.event.load.io.controller

import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import togethervibe.api.event.load.service.iface.EventPicker

@RequestMapping("/v1/person")
@RestController
class PersonController(
    val eventPicker: EventPicker
) {

    @GetMapping(path = ["{personId}/randomEvent"])
    fun getRandomEvent(@PathVariable("personId") personId: String) : ResponseEntity<String> {
        return ResponseEntity("Hello, World!", getHeaders(), HttpStatus.OK)
    }

    private fun getHeaders(): HttpHeaders {
        return HttpHeaders().also {
            it.add(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*")
        }
    }
}
