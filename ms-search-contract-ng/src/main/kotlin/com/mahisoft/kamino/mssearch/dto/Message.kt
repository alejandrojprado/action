package com.mahisoft.kamino.mssearch.dto

import io.swagger.annotations.ApiModel
import java.time.Instant

@ApiModel("Result")
data class Message(
    val uuid: String? = null,
    val groupId: String? = null,
    val message: String? = null,
    val gigaFlag: String? = null,
    val locateCity: String? = null,
    val locateCountry: String? = null,
    val locateCounty: String? = null,
    val locateLat: Float? = null,
    val locateLon: Float? = null,
    val locateRegion: String? = null,
    val rowId: Long? = null,
    val webFlag: String? = null,
    val chatType: String? = null,
    val dateAdded: String? = null,
    val documentFileName: String? = null,
    val firstName: String? = null,
    val fqdn: String? = null,
    val documentMimeType: String? = null,
    val height: Long? = null,
    val id: Long? = null,
    val ipAddress: String? = null,
    val ircChannel: String? = null,
    val ircPort: Long? = null,
    val ircServer: String? = null,
    val isBot: Boolean? = null,
    val isScam: Boolean? = null,
    val isUc: Boolean? = null,
    val lastName: String? = null,
    val licenseId: String? = null,
    val date: Instant? = null,
    val messageDate: String? = null,
    val messageId: Long? = null,
    val onlineLast: String? = null,
    val phone: String? = null,
    val senderId: String? = null,
    val sn: String? = null,
    val statMessage: String? = null,
    val statRecipient: String? = null,
    val sysMessage: String? = null,
    val type: String? = null,
    val userName: String? = null,
    val width: Long? = null,
    val network: String? = null,
    val groupName: String? = null,
    val imageDate: Instant? = null,
    val imageId: String? = null,
    val location: String? = null,
    val onlineLastIndicator: String? = null,
    val fdqn: String? = null,
    val channel: String? = null
)