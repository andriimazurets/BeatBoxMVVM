package com.example.beatboxmvvm

private const val WAV = ".wav"
class Sound(val assetPass: String) {
    val name = assetPass.split("/").last().removeSuffix(WAV)
}