package org.nekomanga.domain.manga

import eu.kanade.tachiyomi.util.lang.capitalizeWords
import org.nekomanga.R
import org.nekomanga.constants.MdConstants

enum class MangaContentRating(val key: String, val nameRes: Int) {
    Safe(MdConstants.ContentRating.safe, R.string.safe),
    Suggestive(MdConstants.ContentRating.suggestive, R.string.suggestive),
    Unknown(MdConstants.ContentRating.unknown, R.string.unknown);

    fun prettyPrint(): String {
        return key.capitalizeWords()
    }

    companion object {
        fun getOrdered(): List<MangaContentRating> {
            return listOf(Safe, Suggestive)
        }

        fun getContentRating(contentRating: String?): MangaContentRating {
            return when {
                contentRating == null -> Unknown
                contentRating.equals(Safe.key, true) -> Safe
                contentRating.equals(Suggestive.key, true) -> Suggestive
                else -> Safe
            }
        }
    }
}
