package eu.kanade.tachiyomi.ui.manga.chapter

import android.app.Dialog
import android.os.Bundle
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.list.listItemsSingleChoice
import com.bluelinelabs.conductor.Controller
import eu.kanade.tachiyomi.R
import eu.kanade.tachiyomi.ui.base.controller.DialogController

class DownloadChaptersDialog<T>(bundle: Bundle? = null) : DialogController(bundle)
        where T : Controller, T : DownloadChaptersDialog.Listener {

    constructor(target: T) : this() {
        targetController = target
    }

    override fun onCreateDialog(savedViewState: Bundle?): Dialog {
        val activity = activity!!

        val choices = intArrayOf(
                R.string.download_1,
                R.string.download_5,
                R.string.download_10,
                R.string.download_custom,
                R.string.download_unread,
                R.string.download_all
        ).map { activity.getString(it) }

        return MaterialDialog(activity)
                .negativeButton(android.R.string.cancel)
                .listItemsSingleChoice(items = choices){_, position, _ ->
                    (targetController as? Listener)?.downloadChapters(position)
                }
    }

    interface Listener {
        fun downloadChapters(choice: Int)
    }

}