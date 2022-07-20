package com.dolivdev.helperdnd.domain.entity.equipnet.conrtact

import android.provider.BaseColumns


class EquipmentContract {
    object EquipmentEntry : BaseColumns {
        const val TABLE_NAME = "equipment"
        const val _ID = "_id"
        const val COLUMN_COIN_ID = "coin_id"
        const val COLUMN_TYPE_ID = "type_id"
        const val COLUMN_CATEGORY_ID = "category_id"
        const val COLUMN_TOOLE_PRICE = "toole_price"
        const val COLUMN_TOOLE_NANE = "toole_name"
        const val COLUMN_TOOLE_DESCRIPTION = "toole_description"
        const val COLUMN_TOOLE_SOURCE = "toole_source"
        const val COLUMN_TOOLE_WIGHT = "toole_wight"
    }

    object TypeEntry : BaseColumns {
        const val TABLE_NAME = "subtype"
        const val _ID = "_id"
        const val COLUMN_CATEGORY_ID = "category_id"
        const val COLUMN_NAME = "sbt_name"
        const val COLUMN_CHANCE = "chance"
    }

    object CoinEntry : BaseColumns {
        const val TABLE_NAME = "coin"
        const val _ID = "_id"
        const val COLUMN_TYPE_PRICE = "type_coin"
    }

    object CategoryEntry : BaseColumns {
        const val TABLE_NAME = "category"
        const val _ID = "_id"
        const val COLUMN_NAME = "ct_name"
    }

    object SourceEntry : BaseColumns {
        const val TABLE_NAME = "source"
        const val _ID = "_id"
        const val COLUMN_NAME = "sr_name"
    }

    object MarketEntry : BaseColumns {
        const val TABLE_NAME = "market"
        const val _ID = "_id"
        const val COLUMN_NAME = "name"
        const val COLUMN_CITY = "city"
    }

    object MarketTableEntry : BaseColumns {
        const val TABLE_NAME = "market_table"
        const val _ID = "_id"
        const val COLUMN_EQUIPMENT_ID = "equipmetnt_id"

        /**TODO */
        const val COLUMN_MARKET_ID = "market_id"
    }
}