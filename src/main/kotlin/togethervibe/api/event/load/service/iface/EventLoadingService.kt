package togethervibe.api.event.load.service.`interface`

import togethervibe.api.event.load.data.Event

interface EventLoadingService {

    fun loadEvents(personId: String): List<Event>
}