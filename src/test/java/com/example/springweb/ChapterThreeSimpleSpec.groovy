package com.example.springweb

import spock.lang.Specification

class ChapterThreeSimpleSpec extends Specification {
    def "the truth could not be truer" () {
        given:
        def truth = true

        expect:
        truth
    }
}
