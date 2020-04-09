package com.example.jokesonyou.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Primary
@Service
class QuoteServiceImpl : QuoteService {

    val chuckNorrisQuotes: ChuckNorrisQuotes = ChuckNorrisQuotes()

    override fun getJoke() = chuckNorrisQuotes.randomQuote
}