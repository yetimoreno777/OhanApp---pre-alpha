package com.sistemasardillisados.ohanaapp

import io.github.jan.supabase.postgrest.from
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

data class Usuario(
    val id: Int,
    val correo: String,
    val contraseña: String
)

suspend fun loginUsuario(correo: String): Usuario? {
    return withContext(Dispatchers.IO) {
        try {
            val result = Supabase
                .from("usuarios")
                .select()
                .eq("correo", correo)
                .single()

            Usuario(
                id = result["id"] as Int,
                correo = result["correo"] as String,
                contraseña = result["contraseña"] as String
            )
        } catch (e: Exception) {
            null
        }
    }
}
