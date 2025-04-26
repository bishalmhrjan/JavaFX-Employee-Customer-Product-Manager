package com.example.diyashop.model.productstype;

public enum ProductEnum {
    JACKET, T_SHIRT , SWEATER , BAG , PURSE,CERAMICS , SHOES ,SLIPPERS , TOYS , PAPER_ITEMS ,
    SCHWALS , SOAP , TEE , METAL , POTTERY ,     NECKLACE, EAR_RINGS;



    public enum ProductType {
        WOLL_SHEEP, WOLL_YAK, SILK,// JacketType
         COLOR_RED, COLOR_BLUE, COLOR_BLACK,//EarringsType
         POT, VASE,//PotteryType
         SINGING_BOWL,//MetalType
         GREEN_TEA, BLACK_TEA, //Tee Type

         HONEY, SALT, SHAMPOO_BAR, //SoapType
         CASHMERE, PASHMINA, //SchwalsType

         GREETING_CARD_SET, NOTEBOOK, PAPER_PHOTO_FRAME,//PaperTypeItems
         CHRISTMAS_TREE, CHRISTMAS_ITEM, //ToysType
         PLASTIC, SANTA_COLOR, FELT, //Slipper Type, shoes Type
         TEA_POTS, SAUCER_SETS, CUPS, //Ceramicstype
         LEATHER, COTTON,// FELT,  SILK, PurseType
        // LEATHER, FELT, COTTON, SILK Bag Type
         GOD, SYMBOL, NORMAL;//T-shirt

     }

}