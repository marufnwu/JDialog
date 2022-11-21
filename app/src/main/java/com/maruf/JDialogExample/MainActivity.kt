package com.maruf.JDialogExample

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maruf.JDialogExample.databinding.ActivityMainBinding
import com.maruf.jdialog.JDialog
import com.maruf.jdialog.JDialogImage

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSuccess.setOnClickListener {
            showSuccessDialog()
        }

        binding.btnWarning.setOnClickListener {
            showWarningDialog()
        }

        binding.btnError.setOnClickListener {
            showDialog(JDialog.IconType.ERROR, "Something Went Wrong")
        }

        binding.btnCustomImage.setOnClickListener {
            showImageDialog()
        }

    }

    private fun showImageDialog() {


        JDialog.make(this)
            .setCancelable(false)
            .setPositiveButton("Dismiss"){
                it.hideDialog()
            }
            .setNegativeButton("Hide"){
                it.hideDialog()
            }
            .setBodyText("Here is warning dialog")
            .imageUrl(JDialogImage(resources.getString(R.string.image_url), null))
            .build()
            .showDialog()
    }

    private fun showDialog(type : JDialog.IconType, bodyText:String) {
        JDialog.make(this)
            .setCancelable(false)
            .setPositiveButton("Dismiss"){
                it.hideDialog()
            }
            .setNegativeButton("Hide"){
                it.hideDialog()
            }
            .setBodyText(bodyText)
            .setIconType(type)
            .build()
            .showDialog()

    }

    private fun showWarningDialog() {
        JDialog.make(this)
            .setCancelable(false)
            .setPositiveButton("Dismiss"){
                it.hideDialog()
            }
            .setNegativeButton("Hide"){
                it.hideDialog()
            }
            .setBodyText("Here is warning dialog")
            .setIconType(JDialog.IconType.WARNING)
            .build()
            .showDialog()

    }

    private fun showSuccessDialog() {
        JDialog.make(this)
            .setCancelable(false)
            .setPositiveButton("Dismiss"){
                it.hideDialog()
            }
            .setNegativeButton("Hide"){
                it.hideDialog()
            }
            .setBodyText("Here is image dialog")
            .setIconType(JDialog.IconType.SUCCESS)
            .build()
            .showDialog()

    }
}