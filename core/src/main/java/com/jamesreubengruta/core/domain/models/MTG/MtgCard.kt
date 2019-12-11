package com.jamesreubengruta.core.domain.models.MTG


import com.google.gson.annotations.SerializedName

data class MtgCard(
    var cards: List<Card?>?
) {
    data class Card(
        var artist: String?, // Lucas Graciano
        var cmc: Int?, // 6
        var colorIdentity: List<String?>?,
        var colors: List<String?>?,
        var flavor: String?, // Even the thrums, the lowliest of slivers, become deadly in its presence.
        var foreignNames: List<Any?>?,
        var hand: String?, // +0
        var id: String?, // bf3def14-8279-53ef-a09f-7652616b322b
        var imageUrl: String?, // http://gatherer.wizards.com/Handlers/Image.ashx?multiverseid=201075&type=card
        var layout: String?, // normal
        var legalities: List<Legality?>?,
        var life: String?, // +7
        var manaCost: String?, // {5}{G}
        var multiverseid: Int?, // 201075
        var name: String?, // Megantic Sliver
        var names: List<Any?>?,
        var number: String?, // 49830
        var originalText: String?, // Whenever you cast a non-Sliver creature spell, exile that spell. If you do, put a token onto the battlefield that's a copy of a random non-Shapeshifter Sliver creature card with the same converted mana cost as that spell.
        var originalType: String?, // Vanguard
        var power: String?, // 3
        var printings: List<String?>?,
        var rarity: String?, // Rare
        var rulings: List<Ruling?>?,
        var `set`: String?, // PRM
        var setName: String?, // Magic Online Promos
        var subtypes: List<String?>?,
        var supertypes: List<Any?>?,
        var text: String?, // Sliver creatures you control get +3/+3.
        var toughness: String?, // 3
        var type: String?, // Creature — Sliver
        var types: List<String?>?,
        var watermark: String? // set (M14)
    ) {
        data class Legality(
            var format: String?, // Vintage
            var legality: String? // Legal
        )

        data class Ruling(
            var date: String?, // 2013-07-01
            var text: String? // Abilities that Slivers grant, as well as power/toughness boosts, are cumulative. However, for some abilities, like flying, having more than one instance of the ability doesn’t provide any additional benefit.
        )
    }
}