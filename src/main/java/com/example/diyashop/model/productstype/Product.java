package com.example.diyashop.model.productstype;

public enum Product {
    JACKET {
        enum ProductType {
            WOLL_SHEEP, WOLL_YAK, SILK;
        }
    }, T_SHIRT {
        enum ProductType {
            GOD,
            SYMBOL, NORMAL;
        }
    },
    SWEATER {
        enum ProductType {
            WOLL_SHEEP, WOLL_YAK, SILK, CASHMERE, COTTON;
        }
    },
    BAG {
        enum ProductType {
            LEATHER, FELT, COTTON, SILK;
        }
    }, PURSE{
        enum ProductType {
            LEATHER, FELT, COTTON, SILK;
        }
    },CERAMICS {
        enum ProductType {
            TEA_POTS, SAUCER_SETS, CUPS;
        }
    }, SHOES {

        enum ProductType {

            PLASTIC, FELT;
        }
    },
    SLIPPERS {
        enum ProductType {

            PLASTIC, SANTA_COLOR, FELT;
        }
    }, TOYS {
        enum ProductType {
            CHRISTMAS_TREE, CHRISTMAS_ITEM;
        }
    },

    PAPER_ITEMS {
        enum ProductType {
            GREETING_CARD_SET, NOTEBOOK, PAPER_PHOTO_FRAME;
        }
    },
    SCHWALS {

        enum ProductType {
            CASHMERE, PASHMINA;
        }
    },
    SOAP {
        enum ProductType {
            HONEY, SALT, SHAMPOO_BAR;
        }

    }, TEE {
        enum ProductType {
            GREEN_TEA, BLACK_TEA;
        }
    },

    METAL {
        enum ProductType {
            SINGING_BOWL;
        }
    },POTTERY{
        enum ProductType{
            POT,VASE;
        }
    },
    JEWELLERY {
        enum JEWELLERY_TYPES {
            NECKLACE, EAR_RINGS {
                enum ProductType {
                    COLOR_RED, COLOR_BLUE, COLOR_BLACK;
                }


            };

        }


    }
}