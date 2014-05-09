package models

trait Category {

  val categories = Map(
    1 -> "DietaryRestrictions",
    2 -> "EthnicRegional",
    3 -> "HealthAndDietConsiderations",
    4 -> "Holiday",
    5 -> "IngredientKeywords",
    6 -> "MainIngredient",
    7 -> "MealCourse",
    8 -> "PreparationTechnique",
    9 -> "Season",
    10 -> "Servings",
    11 -> "StyleTheme",
    12 -> "TotalTime",
    13 -> "TypeofDish",
    14 -> "WebEaseofPreparation"
  )

  val tags = Map(
    "DietaryRestrictions" -> Map(
      1 -> "Gluten Free",
      2 -> "Kosher",
      3 -> "Vegan",
      4 -> "Vegetarian"),
    "EthnicRegional" -> Map(
      5 -> "African",
      6 -> "American",
      7 -> "Asian",
      8 -> "Cajun-Creole",
      9 -> "Caribbean",
      10 -> "Central/South American",
      11 -> "Chinese",
      12 -> "Eastern European/Russian",
      13 -> "English/Irish/Scottish",
      14 -> "French",
      15 -> "German",
      16 -> "Greek",
      17 -> "Hispanic",
      18 -> "Indian",
      19 -> "Italian",
      20 -> "Japanese",
      21 -> "Jewish",
      22 -> "Korean",
      23 -> "Latin American",
      24 -> "Mediterranean",
      25 -> "Mexican",
      26 -> "Middle Eastern",
      27 -> "Moroccan",
      28 -> "Other European",
      29 -> "Scandinavian",
      30 -> "Southern/Soul",
      31 -> "Southwest",
      32 -> "Spanish",
      33 -> "Thai",
      34 -> "Vietnamese"),
    "HealthAndDietConsiderations" -> Map(
      35 -> "Diabetes Appropriate",
      36 -> "Healthy Weight",
      37 -> "Heart Healthy",
      38 -> "High Calcium",
      39 -> "High Fiber",
      40 -> "High Potassium",
      41 -> "Low Calorie",
      42 -> "Low Carbohydrate",
      43 -> "Low Cholesterol",
      44 -> "Low saturated fat",
      45 -> "Low Sodium"),
    "Holiday" -> Map(
      46 -> "Birthday",
      47 -> "Christmas",
      48 -> "Cinco de Mayo",
      49 -> "Easter",
      50 -> "Father's Day",
      51 -> "Halloween",
      52 -> "Hanukkah",
      53 -> "July 4th",
      54 -> "Kwaanza",
      55 -> "Labor Day",
      56 -> "Mardi Gras",
      57 -> "Memorial Day",
      58 -> "Mother's Day",
      59 -> "New Year's",
      60 -> "Passover",
      61 -> "St Patrick's Day",
      62 -> "Super Bowl",
      63 -> "Thanksgiving",
      64 -> "Valentine's Day"),
    "IngredientKeywords" -> Map(
      65 -> "Alcohol",
      66 -> "Beans/legumes",
      67 -> "Berries",
      68 -> "Cheese",
      69 -> "Chocolate",
      70 -> "Citrus",
      71 -> "Dairy",
      72 -> "Eggs",
      73 -> "Fish",
      74 -> "Flour",
      75 -> "Fruit",
      76 -> "Greens",
      77 -> "Nuts",
      78 -> "Pasta",
      79 -> "Pork (used as flavoring)",
      80 -> "Shellfish",
      81 -> "Soy",
      82 -> "Tomatoes",
      83 -> "Vegetables",
      84 -> "Wheat",
      85 -> "Whole Grains"),
    "MainIngredient" -> Map(
      86 -> "Beans/Legumes",
      87 -> "Beef",
      88 -> "Bison/Buffalo",
      89 -> "Chicken",
      90 -> "Eggs",
      91 -> "Fish",
      92 -> "Game",
      93 -> "Lamb",
      94 -> "Pork",
      95 -> "Poultry, other",
      96 -> "Shellfish",
      97 -> "Soy/Tofu",
      98 -> "Turkey"),
    "MealCourse" -> Map(
      99 -> "Appetizers",
      100 -> "Breakfast",
      101 -> "Brunch",
      102 -> "Dessert",
      103 -> "Dinner",
      104 -> "Lunch",
      105 -> "Snack"),
    "PreparationTechnique" -> Map(
      106 -> "Bake",
      107 -> "Boil",
      108 -> "Braise/Stew",
      109 -> "Brine",
      110 -> "Broil",
      111 -> "Freezable",
      112 -> "Grill/BBQ",
      113 -> "Healthy Frying",
      114 -> "Make ahead instructions",
      115 -> "Marinate/Rub",
      116 -> "Microwave",
      117 -> "No-cook",
      118 -> "One pot (one cooking vessel)",
      119 -> "Poach",
      120 -> "Preserve",
      121 -> "Roast",
      122 -> "Saute",
      123 -> "Slow cooker/Crockpot",
      124 -> "Steam",
      125 -> "Stir-Fry"),
    "Season" -> Map(
      126 -> "All Seasons",
      127 -> "Fall",
      128 -> "Spring",
      129 -> "Summer",
      130 -> "Winter",
      131 -> "WinterAll Seasons"),
    "Servings" -> Map(
      132 -> "1",
      133 -> "2",
      134 -> "4",
      135 -> "5",
      136 -> "6",
      137 -> "8 or more"),
    "StyleTheme" -> Map(
      138 -> "Budget",
      139 -> "Comfort foods",
      140 -> "Entertaining, casual",
      141 -> "Entertaining, formal",
      142 -> "Everyday favorites",
      143 -> "Gifts",
      144 -> "Kid-friendly",
      145 -> "Make ahead instructions",
      146 -> "Makeover",
      147 -> "One dish meals",
      148 -> "Picnic/Potluck",
      149 -> "Potluck",
      150 -> "Quick (total 30 min. or less)",
      151 -> "Vegan",
      152 -> "Vegetarian"),
    "TotalTime" -> Map(
      153 -> "1 hour or less",
      154 -> "15 minutes or less",
      155 -> "30 minutes or less",
      156 -> "45 minutes or less",
      157 -> "More than 1 hour"),
    "TypeofDish" -> Map(
      158 -> "Appetizer",
      159 -> "Baked Goods, bars & cookies",
      160 -> "Baked Goods, other",
      161 -> "Baked Goods, quick breads & muffins",
      162 -> "Baked Goods, yeast breads",
      163 -> "Beverages, alcoholic",
      164 -> "Beverages, nonalcoholic",
      165 -> "Beverages, smoothies",
      166 -> "Casserole",
      167 -> "Desserts, cakes",
      168 -> "Desserts, chocolate",
      169 -> "Desserts, frozen",
      170 -> "Desserts, fruit",
      171 -> "Desserts, other",
      172 -> "Desserts, pies & tarts",
      173 -> "Main dish, combination meal",
      174 -> "Main dish, complete meal",
      175 -> "Main dish, fish/seafood",
      176 -> "Main dish, meat",
      177 -> "Main dish, Other",
      178 -> "Main dish, poultry",
      179 -> "Main dish, vegetarian",
      180 -> "Other (non-main dish)",
      181 -> "Pasta",
      182 -> "Pizza",
      183 -> "Salad dressing",
      184 -> "Salad, main dish",
      185 -> "Salad, side/appetizer",
      186 -> "Sandwich",
      187 -> "Sauce/Condiment, marinade/rub",
      188 -> "Sauce/Condiment, savory",
      189 -> "Sauce/Condiment, sweet",
      190 -> "Side dish, grain",
      191 -> "Side dish, potato/starch",
      192 -> "Side dish, vegetable",
      193 -> "Snack",
      194 -> "Soups/stews"),
    "WebEaseofPreparation" -> Map(
      195 -> "Challenging",
      196 -> "Easy",
      197 -> "Moderate")
  )
}