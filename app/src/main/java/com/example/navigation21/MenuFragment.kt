package com.example.navigation21

import android.R
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment


class MenuFragment : DialogFragment() {

/*    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val title = arguments?.getInt("title") ?: 0

        return AlertDialog.Builder(requireActivity())
            .setIcon(R.drawable.alert_dialog_icon)
            .setTitle(title)
            .setPositiveButton(R.string.alert_dialog_ok) { dialog, which ->
                (requireActivity() as? FragmentAlertDialog)?.doPositiveClick()
            }
            .setNegativeButton(R.string.alert_dialog_cancel) { dialog, which ->
                (requireActivity() as? FragmentAlertDialog)?.doNegativeClick()
            }
            .create()
    }*/
    companion object {
        fun newInstance(title: Int): MenuFragment {
            val frag = MenuFragment()
            val args = Bundle()
            args.putInt("title", title)
            frag.arguments = args
            return frag
        }
    }


}