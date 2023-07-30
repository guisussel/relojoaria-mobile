package br.com.relojoariasusselmobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform