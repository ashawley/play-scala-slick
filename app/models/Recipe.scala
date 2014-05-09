package models

// case class Recipe(

trait Recipe {
  val recipe = Map(
    8552 -> Map(
      "title" -> "Bay-Spiced Roast Turkey",
      "brand" -> "EatingWell",
      "author" -> "Bill Scepansky",
      "photographer" -> "Helen Norman",
      "image" -> "MP8552_Norman",
      "servings" -> 12,
      "servingSize" -> "3 oz. turkey without skin plus 1/4 cup gravy",
      "yield" -> "12 servings turkey (plus leftovers) & 4 cups gravy",
      "totalTime" -> 165,
      "totalTimeDesc" -> "2 3/4 hours",
      "activeTime" -> 75,
      "activeTimeDesc" -> "1 1/4 hours",
      "hednote" -> "In this healthy roast turkey recipe, brining keeps the turkey moist and a homemade bay-spice mix gives the turkey amazing flavor. Diced celery root or parsnip adds flavor and texture to the gravy. A heritage, natural or organic turkey, without added sodium solution (found in most conventional turkeys), tastes best in this recipe. If you have a conventional bird, just skip the brining (Step 1). The recipe that's included for Bay Spice Blend makes 1 cup; if you want to skip the step of making the spice blend, you can substitute Old Bay Seasoning.",
      "servingSuggestion" -> "",
      "makeAheadTip" -> "Brine turkey (Step 1) for up to 16 hours. Store spice blend airtight at room temperature for up to 3 months.",
      "equipment" -> "",
      "ingredientXml" -> """<SubHead name="Bay Spice Blend"><RecipeIngredient><Quantity>1/4</Quantity><Unit>cup</Unit><Item>dry mustard</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>8</Quantity><Unit/><Item>whole bay leaves, finely crushed</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit>tablespoons</Unit><Item>crushed red pepper</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit>tablespoons</Unit><Item>celery seed</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit>tablespoons</Unit><Item>ground ginger</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1 1/2</Quantity><Unit>tablespoons</Unit><Item>dried thyme</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>tablespoon</Unit><Item>sweet paprika</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>tablespoon</Unit><Item>ground cinnamon</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>tablespoon</Unit><Item>ground mace or nutmeg</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>tablespoon</Unit><Item>freshly ground pepper</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit>teaspoons</Unit><Item>onion powder</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient></SubHead><SubHead name="Brine &amp; Turkey"><RecipeIngredient><Quantity>1</Quantity><Unit/><Item>gallon water</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>cup</Unit><Item>kosher salt</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>3/4</Quantity><Unit>cup</Unit><Item>sugar</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit/><Item>medium onions</Item><Note>, sliced</Note><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>head</Unit><Item>celery</Item><Note>, cut into 3-inch lengths</Note><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1/2</Quantity><Unit>cup</Unit><Item>of the Bay Spice Blend</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>8</Quantity><Unit>cups</Unit><Item>ice-cold water</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>4</Quantity><Unit>cups</Unit><Item>ice cubes</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1 12- to 14-</Quantity><Unit>pound</Unit><Item>turkey</Item><Note>, preferably natural, organic or heritage (see Tips)</Note><MeasureType/><IngredientBrand/></RecipeIngredient></SubHead><SubHead name="Turkey Rub"><RecipeIngredient><Quantity>1/3</Quantity><Unit>cup</Unit><Item>of the Bay Spice Blend</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>teaspoon</Unit><Item>kosher salt</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit/><Item>lemons</Item><Note>, zested then halved, divided</Note><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>tablespoon</Unit><Item>canola oil</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>4</Quantity><Unit/><Item>shallots</Item><Note>, halved</Note><MeasureType/><IngredientBrand/></RecipeIngredient></SubHead><SubHead name="Celery Root Pan Gravy"><RecipeIngredient><Quantity>1/2</Quantity><Unit>cup</Unit><Item>finely diced onion</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit>sprigs</Unit><Item>fresh thyme</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit/><Item>bay leaf</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1</Quantity><Unit>cup</Unit><Item>dry white wine</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit>cups</Unit><Item>low-sodium turkey or chicken broth or stock</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>3</Quantity><Unit>tablespoons</Unit><Item>cornstarch</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>2</Quantity><Unit>cups</Unit><Item>water</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1 1/2</Quantity><Unit>cups</Unit><Item>finely diced peeled celery root (see Tips) or parsnips</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1/4</Quantity><Unit>cup</Unit><Item>snipped fresh chives</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient><RecipeIngredient><Quantity>1/4</Quantity><Unit>teaspoon</Unit><Item>freshly ground white pepper, or to taste</Item><Note/><MeasureType/><IngredientBrand/></RecipeIngredient></SubHead>""",
      "method" -> """1. To brine turkey: At least 8 hours (and no more than 16 hours) before you plan to serve your turkey, make the brine. To prepare Bay Spice Blend (if desired), combine dry mustard, bay leaves, crushed red pepper, celery seed, ginger, thyme, paprika, cinnamon, mace (or nutmeg), pepper and onion powder in a medium bowl. To prepare the brine, combine water, 1 cup salt, sugar, onions, celery and 1/2 cup of the spice blend in a large stock pot. Bring to a boil over high heat, stirring to dissolve the salt and sugar. Let cool to room temperature. Then stir in ice-cold water and ice. Remove neck and giblets from turkey and discard. Add the turkey to the brine; weight it with a plate, if necessary, so it stays submerged. Cover and refrigerate for at least 8 hours and no longer than 16 hours. (If you do not have enough space in your refrigerator, you can add enough sealed, clean ice packs to the pot to keep the turkey at 40°F or colder.)
2. To rub & roast turkey: About 3 1/2 to 4 hours before you want to serve the turkey, remove it from the brine and thoroughly rinse with cool water. (Discard the brine.) Pat dry with paper towels.
3. Combine 1/3 cup spice blend, 1 teaspoon salt and lemon zest in a small bowl. (There should be enough spice blend left for the stuffing.) Rub the mixture under the skin on the turkey breast, thighs and legs and inside the cavity as evenly as possible without tearing the skin. Rub the outside of the turkey with oil. Stuff the cavity with shallots and the zested lemon halves.
4. Coat a rack with cooking spray and place it in a roasting pan. Place the turkey on the rack, breast-side down, and let stand at room temperature for 30 minutes.
5. Meanwhile, preheat oven to 400°F.
6. Roast the turkey for 30 minutes. Reduce oven temperature to 350°, add 2 cups hot water to the pan to prevent the drippings from burning and roast for 30 minutes more.
7. Remove the turkey from the oven and very carefully turn it breast-side up. Then continue roasting until an instant-read thermometer inserted into the thickest part of a thigh without touching bone registers 165°F, 30 minutes to 1 hour more. (If the turkey is larger than 14 pounds, add 3 to 6 minutes more roasting time for each additional pound.)
8. Transfer the turkey to a clean cutting board, leaving the drippings in the pan. Tent the turkey with foil to keep warm and let rest while you prepare the gravy.
9. To prepare gravy: Set the roasting pan over two burners on medium-high heat; add diced onion, thyme sprigs and bay leaf and cook, stirring and scraping up any browned bits, until the onion is soft, about 4 minutes. Add wine, bring to a boil over medium-high heat and cook until reduced by about half, 6 to 8 minutes. Carefully strain the liquid though a fine sieve and return the strained liquid to the roasting pan over medium-high heat. Combine broth and cornstarch in a measuring cup and slowly whisk into the liquid in the pan. Add 2 cups water and celery root (or parsnips) and cook, whisking constantly, until the vegetables are tender and the gravy is thickened, about 10 minutes. Remove from the heat; stir in chives and white pepper.
10. Carve the turkey and serve with gravy.""",
      "tips" -> """Tips:
For your holiday turkey, we recommend using a natural, organic or heritage turkey, because it will not contain any sodium solution that is added to most conventional turkeys and will have a better taste and texture. If you can only find a conventional turkey, you can still use a recipe that calls for a natural turkey, just skip any brining instructions. The added brine would make the turkey — and gravy — too salty.

Find celery root, a celery-flavored- root vegetable with a texture similar to potatoes when cooked, in the refrigerated produce section near other root vegetables. To peel it, trim off the root and stem end, then remove the thick skin with a knife or use a vegetable peeler and peel around the root several times to remove the fibrous skin. """,
      "nutritionBonus" -> "Zinc (20% daily value)",
      "nutritionNote" -> "",
      "nutritionCarbServings" -> "1/2",
      "nutritionExchanges" -> "1/2 vegetable, 3 1/2 lean meat",
      "nutritionServing" -> "Per serving (3 oz. turkey without skin plus 1/4 cup gravy)",
      "addedSugars" -> 1))
}
