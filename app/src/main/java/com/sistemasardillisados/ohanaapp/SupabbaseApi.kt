package com.sistemasardillisados.ohanaapp

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.auth.Auth
import io.github.jan.supabase.postgrest.Postgrest

val Supabase = createSupabaseClient(
    supabaseUrl = "ttps://iawhpulnrvyodgwwzqsq.supabase.co",
    supabaseKey = "process.env.SUPABASE_KEY"
) {
    install(Auth)
    install(Postgrest)
}
