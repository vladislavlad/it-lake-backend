package org.itlake.service.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(schema = "it_lake", name = "tech_type")
data class TechType(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        override var id: Long,
        var name: String,
        var color: String,
) : Model<Long>