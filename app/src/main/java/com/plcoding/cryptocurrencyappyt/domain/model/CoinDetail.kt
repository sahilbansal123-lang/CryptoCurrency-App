package com.plcoding.cryptocurrencyappyt.domain.model

import android.content.ClipDescription
import com.plcoding.cryptocurrencyappyt.data.remote.dto.TeamMembers

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMembers>
)
