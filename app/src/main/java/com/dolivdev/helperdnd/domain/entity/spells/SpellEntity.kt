package com.dolivdev.helperdnd.domain.entity.spells

data class SpellEntity(
    var id: Int,
    var source_id: Int,
    var school_id: Int,
    var level_id: Int,
    var components: String,
    var distance: String,
    var duration: String,
    var matComponents: String,
    var description: String,
    var name: String,
    var timeCast: String,
    var stLevel: String,
    var stSource: String,
    var stSchool: String
)