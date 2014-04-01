package smitek.evented.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import smitek.evented.Event;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/event")
public class EventController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    Event createEvent(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Event(name, name, null, null);
    }

    @RequestMapping(method= RequestMethod.POST)
    public @ResponseBody
    Event saveEvent(
            @RequestParam(value="description", required=true) String description) {
        return new Event(String.valueOf(counter.incrementAndGet()), description, LocalDate.now(), null);
    }

}
