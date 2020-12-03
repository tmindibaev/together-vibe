package togethervibe.api.event.load.service

import event.data.Event
import org.springframework.stereotype.Service
import togethervibe.api.event.load.service.iface.EventPicker
import kotlin.js.ExperimentalJsExport

@Service
class RandomEventPicker : EventPicker {
    @ExperimentalJsExport
    override fun pickEvent(events: List<Event>): Event {
        return events.random()
    }
}