package eu.kanade.tachiyomi.source.online.models.dto

import kotlinx.serialization.Serializable

@Serializable data class LegacyIdDto(val type: String, val ids: List<Int>)

@Serializable data class LegacyMappingDto(val data: List<LegacyMappingDataDto>)

@Serializable data class LegacyMappingDataDto(val attributes: LegacyMappingAttributesDto)

@Serializable data class LegacyMappingAttributesDto(val legacyId: Int, val newId: String)
