package com.example.quoteofday.main

data class Quote(val content: String, val author: String){
    init{
        require(content.isNotBlank())
        require(author.isNotBlank())
    }
}


val quoteText = "“All of us have to learn how to invent our lives, " +
        "make them up, imagine them. We need to be taught these skills; " +
        "we need guides to show us how. " +
        "If we don’t, our lives get made up for us by other people.”"

val quote = Quote(quoteText, "Ursula Le Guin")
