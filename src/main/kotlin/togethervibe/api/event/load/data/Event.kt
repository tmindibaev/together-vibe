package togethervibe.togethervibeapi.event.load.data

import java.time.ZonedDateTime

data class Event(
    val name: String,
    val date: ZonedDateTime?,
    val place: String?,
    val extras: Map<String, String>
)