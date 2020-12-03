package togethervibe.api.event.load.service.iface

import event.data.Event

interface EventLoadingService {

    fun loadEvents(personId: String): List<Event>
}