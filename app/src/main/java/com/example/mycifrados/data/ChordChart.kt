package com.example.mycifrados.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chord_charts")
data class ChordChart(
    @PrimaryKey val id: String = "", // ID de Firestore
    val title: String = "",
    val artist: String = "",
    val content: String = "", // Cifrado: [C]Amor [G]amar...
    val ownerId: String = "",
    val collaborators: List<String> = emptyList(),
    val lastModified: Long = System.currentTimeMillis()
)
