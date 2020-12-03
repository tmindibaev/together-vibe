package togethervibe.api.event.load.service

import event.data.Event
import togethervibe.api.event.load.service.iface.EventLoadingService

class EventLoadingServiceMock : EventLoadingService {

    override fun loadEvents(personId: String): List<Event> {
        return listOf(Event(name = "Hello, "), Event(name = "World!"))
    }
}