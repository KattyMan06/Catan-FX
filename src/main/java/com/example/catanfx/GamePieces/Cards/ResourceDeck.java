package com.example.catanfx.GamePieces.Cards;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;

public class ResourceDeck {
    // instance variables
    private static Deque<ResourceCard> lumberDeck, brickDeck, woolDeck, grainDeck, oreDeck;

    // constructor
    public ResourceDeck() {
        lumberDeck = new ArrayDeque<>();
        brickDeck = new ArrayDeque<>() ;
        woolDeck = new ArrayDeque<>();
        grainDeck = new ArrayDeque<>();
        oreDeck = new ArrayDeque<>();
        fill("lumber");
        fill("brick");
        fill("wool");
        fill("grain");
        fill("ore");
    }

 public static void fill(String resource) {
        // fill the deck with the specified resource
        if (resource.equals("lumber")) {
            for (int i = 0; i < 19; i++) {
                lumberDeck.add(new ResourceCard(resource));
            }
        } else if (resource.equals("brick")) {
            for (int i = 0; i < 19; i++) {
                brickDeck.add(new ResourceCard(resource));
            }
        } else if (resource.equals("wool")) {
            for (int i = 0; i < 19; i++) {
                woolDeck.add(new ResourceCard(resource));
            }
        } else if (resource.equals("grain")) {
            for (int i = 0; i < 19; i++) {
                grainDeck.add(new ResourceCard(resource));
            }
        } else if (resource.equals("ore")) {
            for (int i = 0; i < 19; i++) {
                oreDeck.add(new ResourceCard(resource));
            }
        }
    }

    public static ResourceCard getCard(String resource) {
        // get a card from the deck
        if (resource.equals("lumber")) {
            return lumberDeck.remove();
        } else if (resource.equals("brick")) {
            return brickDeck.remove();
        } else if (resource.equals("wool")) {
            return woolDeck.remove();
        } else if (resource.equals("grain")) {
            return grainDeck.remove();
        } else if (resource.equals("ore")) {
            return oreDeck.remove();
        }
        return null;
    }

    public static boolean isEmpty(String resource) {
        if (resource.equals("lumber")) {
            return lumberDeck.isEmpty();
        } else if (resource.equals("brick")) {
            return brickDeck.isEmpty();
        } else if (resource.equals("wool")) {
            return woolDeck.isEmpty();
        } else if (resource.equals("grain")) {
            return grainDeck.isEmpty();
        } else if (resource.equals("ore")) {
            return oreDeck.isEmpty();
        }
        return true;
    }

    public static void addCard(String card){
        card = card.toLowerCase();
        if (card.equals("lumber")) {
            lumberDeck.add(new ResourceCard(card));
        } else if (card.equals("brick")) {
            brickDeck.add(new ResourceCard(card));
        } else if (card.equals("wool")) {
            woolDeck.add(new ResourceCard(card));
        } else if (card.equals("grain")) {
            grainDeck.add(new ResourceCard(card));
        } else if (card.equals("ore")) {
            oreDeck.add(new ResourceCard(card));
        }
    }

    public static int getSize(String resource) {
        if (resource.equals("lumber")) {
            return lumberDeck.size();
        } else if (resource.equals("brick")) {
            return brickDeck.size();
        } else if (resource.equals("wool")) {
            return woolDeck.size();
        } else if (resource.equals("grain")) {
            return grainDeck.size();
        } else if (resource.equals("ore")) {
            return oreDeck.size();
        }
        return -1;
    }
 }


