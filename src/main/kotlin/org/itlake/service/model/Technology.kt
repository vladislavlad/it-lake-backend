package org.itlake.service.model

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(schema = "it_lake", name = "technologies")
data class Technology  (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        override var id: Long,
        var name: String,
        var description: String,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "type_id")
        var type: TechType,
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "parent_id")
        var parent: Technology? = null,
        var link: String? = null,
) : Model<Long>
