package togethervibe.api.event.load.service.iface

import event.data.Event

interface EventPicker {

    fun pickEvent(events: List<Event>): Event
}