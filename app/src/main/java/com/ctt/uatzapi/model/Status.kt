package com.ctt.uatzapi.model

import android.graphics.Bitmap

data class Status(var imagem: Bitmap? =null,
             val nome: String,
             val hora: String) {
}