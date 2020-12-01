package togethervibe.api.event.load.service.`interface`

import togethervibe.api.event.load.data.Event

interface EventPicker {

    fun pickEvent(events: List<Event>): Event
}