package com.example.appmvvm.model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel {
            val position:Int = (0..10).random()
            return quotes[position]
        }
        private val quotes = listOf(
            QuoteModel(
                quote = "No es un error. ¡Es una característica no documentada!",
                author = "Anónimo"
            ),
            QuoteModel(
                quote = "“Desarrollador de software”: un organismo que convierte la cafeína en software",
                author = "Anónimo"
            ),
            QuoteModel(
                quote = "Si la depuración es el proceso de eliminación de errores de software, entonces la programación debe ser el proceso de ponerlos en",
                author = "Edsger Dijkstra"
            ),
            QuoteModel(
                quote = "A user interface is like a joke. If you have to explain it, it’s not that good.",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "I don’t care if it works on your machine! We are not shipping your machine!",
                author = "Vidiu Platon"
            ),
            QuoteModel(
                quote = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                author = "Bill Gates"
            ),
            QuoteModel(
                quote = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                author = "Anonymous"
            ),
            QuoteModel(quote = "Things aren’t always #000000 and #FFFFFF", author = "Anonymous"),
            QuoteModel(quote = "Talk is cheap. Show me the code.", author = "Linus Torvalds"),
            QuoteModel(
                quote = "Software and cathedrals are much the same — first we build them, then we pray.",
                author = "Anonymous"
            ),
            QuoteModel(quote = "¿A que esperas?, suscríbete.", author = "AristiDevs")
        )
    }
}