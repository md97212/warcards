An implementation of the War card game
======================================

* Requires Java 8
* run 'mvn clean package'
* to run a sample game, 'java -jar ./target/WarCardGame.jar'


### Example output from 'mvn test'
    
    $ mvn test
    Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=128m; support was removed in 8.0
    [INFO] Scanning for projects...
    [WARNING]
    [WARNING] Some problems were encountered while building the effective model for com.mark:games:jar:1.0-SNAPSHOT
    [WARNING] 'build.plugins.plugin.version' for org.apache.maven.plugins:maven-jar-plugin is missing. @ line 89, column 21
    [WARNING]
    [WARNING] It is highly recommended to fix these problems because they threaten the stability of your build.
    [WARNING]
    [WARNING] For this reason, future Maven versions might no longer support building such malformed projects.
    [WARNING]
    [INFO]
    [INFO] ------------------------------------------------------------------------
    [INFO] Building games 1.0-SNAPSHOT
    [INFO] ------------------------------------------------------------------------
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ games ---
    [WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
    [WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] Copying 2 resources
    [INFO]
    [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ games ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO]
    [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ games ---
    [WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
    [INFO] skip non existing resourceDirectory /Users/mark/dev/qwdev/repo/warcards/src/test/resources
    [INFO]
    [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ games ---
    [INFO] Nothing to compile - all classes are up to date
    [INFO]
    [INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ games ---
    [INFO] Surefire report directory: /Users/mark/dev/qwdev/repo/warcards/target/surefire-reports
    
    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running com.mark.war.DeckTest
    SLF4J: Class path contains multiple SLF4J bindings.
    SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-simple/1.6.4/slf4j-simple-1.6.4.jar!/org/slf4j/impl/StaticLoggerBinder.class]
    SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-log4j12/1.7.5/slf4j-log4j12-1.7.5.jar!/org/slf4j/impl/StaticLoggerBinder.class]
    SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
    1 [main] INFO com.mark.war.DeckImpl - *** Creating Deck with 4 suits and 13 ranks ***
    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.208 sec
    Running com.mark.war.WarTest
    173 [main] INFO com.mark.war.Player - Dealing Four of CLUBS to player #1
    174 [main] INFO com.mark.war.Player - Dealing Three of SPADES to player #1
    174 [main] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #2
    174 [main] INFO com.mark.war.Player - Dealing Five of CLUBS to player #2
    175 [main] INFO com.mark.war.Player - Dealing Four of SPADES to player #3
    175 [main] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #3
    175 [main] INFO com.mark.war.DeckImpl - *** Creating Deck with 4 suits and 13 ranks ***
    176 [main] INFO com.mark.war.War - Dealing 52 cards to 3 players
    181 [main] INFO com.mark.war.Player - Dealing Ace of HEARTS to player #0
    181 [main] INFO com.mark.war.Player - Dealing Two of HEARTS to player #1
    182 [main] INFO com.mark.war.Player - Dealing Three of HEARTS to player #2
    182 [main] INFO com.mark.war.Player - Dealing Four of HEARTS to player #0
    183 [main] INFO com.mark.war.Player - Dealing Five of HEARTS to player #1
    183 [main] INFO com.mark.war.Player - Dealing Six of HEARTS to player #2
    183 [main] INFO com.mark.war.Player - Dealing Seven of HEARTS to player #0
    183 [main] INFO com.mark.war.Player - Dealing Eight of HEARTS to player #1
    184 [main] INFO com.mark.war.Player - Dealing Nine of HEARTS to player #2
    184 [main] INFO com.mark.war.Player - Dealing Ten of HEARTS to player #0
    184 [main] INFO com.mark.war.Player - Dealing Jack of HEARTS to player #1
    184 [main] INFO com.mark.war.Player - Dealing Queen of HEARTS to player #2
    185 [main] INFO com.mark.war.Player - Dealing King of HEARTS to player #0
    185 [main] INFO com.mark.war.Player - Dealing Ace of SPADES to player #1
    185 [main] INFO com.mark.war.Player - Dealing Two of SPADES to player #2
    185 [main] INFO com.mark.war.Player - Dealing Three of SPADES to player #0
    186 [main] INFO com.mark.war.Player - Dealing Four of SPADES to player #1
    186 [main] INFO com.mark.war.Player - Dealing Five of SPADES to player #2
    186 [main] INFO com.mark.war.Player - Dealing Six of SPADES to player #0
    187 [main] INFO com.mark.war.Player - Dealing Seven of SPADES to player #1
    187 [main] INFO com.mark.war.Player - Dealing Eight of SPADES to player #2
    187 [main] INFO com.mark.war.Player - Dealing Nine of SPADES to player #0
    187 [main] INFO com.mark.war.Player - Dealing Ten of SPADES to player #1
    187 [main] INFO com.mark.war.Player - Dealing Jack of SPADES to player #2
    188 [main] INFO com.mark.war.Player - Dealing Queen of SPADES to player #0
    188 [main] INFO com.mark.war.Player - Dealing King of SPADES to player #1
    188 [main] INFO com.mark.war.Player - Dealing Ace of CLUBS to player #2
    188 [main] INFO com.mark.war.Player - Dealing Two of CLUBS to player #0
    188 [main] INFO com.mark.war.Player - Dealing Three of CLUBS to player #1
    189 [main] INFO com.mark.war.Player - Dealing Four of CLUBS to player #2
    190 [main] INFO com.mark.war.Player - Dealing Five of CLUBS to player #0
    190 [main] INFO com.mark.war.Player - Dealing Six of CLUBS to player #1
    190 [main] INFO com.mark.war.Player - Dealing Seven of CLUBS to player #2
    191 [main] INFO com.mark.war.Player - Dealing Eight of CLUBS to player #0
    191 [main] INFO com.mark.war.Player - Dealing Nine of CLUBS to player #1
    191 [main] INFO com.mark.war.Player - Dealing Ten of CLUBS to player #2
    191 [main] INFO com.mark.war.Player - Dealing Jack of CLUBS to player #0
    191 [main] INFO com.mark.war.Player - Dealing Queen of CLUBS to player #1
    192 [main] INFO com.mark.war.Player - Dealing King of CLUBS to player #2
    192 [main] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #0
    192 [main] INFO com.mark.war.Player - Dealing Two of DIAMONDS to player #1
    192 [main] INFO com.mark.war.Player - Dealing Three of DIAMONDS to player #2
    192 [main] INFO com.mark.war.Player - Dealing Four of DIAMONDS to player #0
    193 [main] INFO com.mark.war.Player - Dealing Five of DIAMONDS to player #1
    193 [main] INFO com.mark.war.Player - Dealing Six of DIAMONDS to player #2
    193 [main] INFO com.mark.war.Player - Dealing Seven of DIAMONDS to player #0
    194 [main] INFO com.mark.war.Player - Dealing Eight of DIAMONDS to player #1
    194 [main] INFO com.mark.war.Player - Dealing Nine of DIAMONDS to player #2
    194 [main] INFO com.mark.war.Player - Dealing Ten of DIAMONDS to player #0
    194 [main] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #1
    195 [main] INFO com.mark.war.Player - Dealing Queen of DIAMONDS to player #2
    196 [main] INFO com.mark.war.War - New battle...
    224 [main] INFO com.mark.war.Player -    + Player #0 plays Ten of DIAMONDS
    224 [main] INFO com.mark.war.Player -    + Player #1 plays Jack of DIAMONDS
    225 [main] INFO com.mark.war.Player -    + Player #2 plays Queen of DIAMONDS
    228 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    237 [main] INFO com.mark.war.War - New battle...
    238 [main] INFO com.mark.war.Player -    + Player #0 plays Seven of DIAMONDS
    240 [main] INFO com.mark.war.Player -    + Player #1 plays Eight of DIAMONDS
    241 [main] INFO com.mark.war.Player -    + Player #2 plays Nine of DIAMONDS
    245 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    245 [main] INFO com.mark.war.War - New battle...
    245 [main] INFO com.mark.war.Player -    + Player #0 plays Four of DIAMONDS
    245 [main] INFO com.mark.war.Player -    + Player #1 plays Five of DIAMONDS
    245 [main] INFO com.mark.war.Player -    + Player #2 plays Six of DIAMONDS
    248 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    248 [main] INFO com.mark.war.War - New battle...
    248 [main] INFO com.mark.war.Player -    + Player #0 plays Ace of DIAMONDS
    248 [main] INFO com.mark.war.Player -    + Player #1 plays Two of DIAMONDS
    248 [main] INFO com.mark.war.Player -    + Player #2 plays Three of DIAMONDS
    250 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    251 [main] INFO com.mark.war.War - New battle...
    251 [main] INFO com.mark.war.Player -    + Player #0 plays Jack of CLUBS
    251 [main] INFO com.mark.war.Player -    + Player #1 plays Queen of CLUBS
    251 [main] INFO com.mark.war.Player -    + Player #2 plays King of CLUBS
    253 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    254 [main] INFO com.mark.war.War - New battle...
    255 [main] INFO com.mark.war.Player -    + Player #0 plays Eight of CLUBS
    255 [main] INFO com.mark.war.Player -    + Player #1 plays Nine of CLUBS
    256 [main] INFO com.mark.war.Player -    + Player #2 plays Ten of CLUBS
    259 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    259 [main] INFO com.mark.war.War - New battle...
    259 [main] INFO com.mark.war.Player -    + Player #0 plays Five of CLUBS
    260 [main] INFO com.mark.war.Player -    + Player #1 plays Six of CLUBS
    260 [main] INFO com.mark.war.Player -    + Player #2 plays Seven of CLUBS
    263 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    264 [main] INFO com.mark.war.War - New battle...
    264 [main] INFO com.mark.war.Player -    + Player #0 plays Two of CLUBS
    265 [main] INFO com.mark.war.Player -    + Player #1 plays Three of CLUBS
    265 [main] INFO com.mark.war.Player -    + Player #2 plays Four of CLUBS
    267 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    267 [main] INFO com.mark.war.War - New battle...
    268 [main] INFO com.mark.war.Player -    + Player #0 plays Queen of SPADES
    268 [main] INFO com.mark.war.Player -    + Player #1 plays King of SPADES
    268 [main] INFO com.mark.war.Player -    + Player #2 plays Ace of CLUBS
    272 [main] INFO com.mark.war.War - ...Player #1 wins battle and adds 3 cards to stack
    272 [main] INFO com.mark.war.War - New battle...
    273 [main] INFO com.mark.war.Player -    + Player #0 plays Nine of SPADES
    273 [main] INFO com.mark.war.Player -    + Player #1 plays Ten of SPADES
    275 [main] INFO com.mark.war.Player -    + Player #2 plays Jack of SPADES
    284 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    285 [main] INFO com.mark.war.War - New battle...
    286 [main] INFO com.mark.war.Player -    + Player #0 plays Six of SPADES
    288 [main] INFO com.mark.war.Player -    + Player #1 plays Seven of SPADES
    299 [main] INFO com.mark.war.Player -    + Player #2 plays Eight of SPADES
    303 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    305 [main] INFO com.mark.war.War - New battle...
    305 [main] INFO com.mark.war.Player -    + Player #0 plays Three of SPADES
    306 [main] INFO com.mark.war.Player -    + Player #1 plays Four of SPADES
    306 [main] INFO com.mark.war.Player -    + Player #2 plays Five of SPADES
    307 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    307 [main] INFO com.mark.war.War - New battle...
    308 [main] INFO com.mark.war.Player -    + Player #0 plays King of HEARTS
    308 [main] INFO com.mark.war.Player -    + Player #1 plays Ace of SPADES
    308 [main] INFO com.mark.war.Player -    + Player #2 plays Two of SPADES
    311 [main] INFO com.mark.war.War - ...Player #0 wins battle and adds 3 cards to stack
    314 [main] INFO com.mark.war.War - New battle...
    315 [main] INFO com.mark.war.Player -    + Player #0 plays Ten of HEARTS
    315 [main] INFO com.mark.war.Player -    + Player #1 plays Jack of HEARTS
    315 [main] INFO com.mark.war.Player -    + Player #2 plays Queen of HEARTS
    317 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    318 [main] INFO com.mark.war.War - New battle...
    321 [main] INFO com.mark.war.Player -    + Player #0 plays Seven of HEARTS
    322 [main] INFO com.mark.war.Player -    + Player #1 plays Eight of HEARTS
    324 [main] INFO com.mark.war.Player -    + Player #2 plays Nine of HEARTS
    326 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    327 [main] INFO com.mark.war.War - New battle...
    327 [main] INFO com.mark.war.Player -    + Player #0 plays Four of HEARTS
    327 [main] INFO com.mark.war.Player -    + Player #1 plays Five of HEARTS
    327 [main] INFO com.mark.war.Player -    + Player #2 plays Six of HEARTS
    328 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    331 [main] INFO com.mark.war.War - New battle...
    331 [main] INFO com.mark.war.Player -    + Player #0 plays Ace of HEARTS
    332 [main] INFO com.mark.war.Player -    + Player #1 plays Two of HEARTS
    333 [main] INFO com.mark.war.Player -    + Player #2 plays Three of HEARTS
    333 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    343 [main] INFO com.mark.war.War - Game ranking {45=[#Player: 2, #CardsInHand: [], #CardsInStack: 45, StackCards Detail: [Jack of DIAMONDS, Queen of DIAMONDS, Ten of DIAMONDS, Eight of DIAMONDS, Nine of DIAMONDS, Seven of DIAMONDS, Five of DIAMONDS, Six of DIAMONDS, Four of DIAMONDS, Two of DIAMONDS, Three of DIAMONDS, Ace of DIAMONDS, Queen of CLUBS, King of CLUBS, Jack of CLUBS, Nine of CLUBS, Ten of CLUBS, Eight of CLUBS, Six of CLUBS, Seven of CLUBS, Five of CLUBS, Three of CLUBS, Four of CLUBS, Two of CLUBS, Ten of SPADES, Jack of SPADES, Nine of SPADES, Seven of SPADES, Eight of SPADES, Six of SPADES, Four of SPADES, Five of SPADES, Three of SPADES, Jack of HEARTS, Queen of HEARTS, Ten of HEARTS, Eight of HEARTS, Nine of HEARTS, Seven of HEARTS, Five of HEARTS, Six of HEARTS, Four of HEARTS, Two of HEARTS, Three of HEARTS, Ace of HEARTS]], 3=[#Player: 0, #CardsInHand: [], #CardsInStack: 3, StackCards Detail: [Ace of SPADES, Two of SPADES, King of HEARTS], #Player: 1, #CardsInHand: [], #CardsInStack: 3, StackCards Detail: [King of SPADES, Ace of CLUBS, Queen of SPADES]]}
    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.261 sec
    
    Results :
    
    Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO]
    [INFO] >>> exec-maven-plugin:1.1.1:java (default) > validate @ games >>>
    [INFO]
    [INFO] <<< exec-maven-plugin:1.1.1:java (default) < validate @ games <<<
    [INFO]
    [INFO] --- exec-maven-plugin:1.1.1:java (default) @ games ---
    SLF4J: Class path contains multiple SLF4J bindings.
    SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-simple/1.6.4/slf4j-simple-1.6.4.jar!/org/slf4j/impl/StaticLoggerBinder.class]
    SLF4J: Found binding in [jar:file:/Users/mark/.m2/repository/org/slf4j/slf4j-log4j12/1.7.5/slf4j-log4j12-1.7.5.jar!/org/slf4j/impl/StaticLoggerBinder.class]
    SLF4J: See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.
    0 [com.mark.war.War.main()] INFO com.mark.war.War - Play War with 4 players and a shuffled deck containing  13 suits and 4 ranks
    1 [com.mark.war.War.main()] INFO com.mark.war.DeckImpl - *** Creating Deck with 4 suits and 13 ranks ***
    52 [com.mark.war.War.main()] INFO com.mark.war.DeckImpl - *** Shuffle Deck ***
    52 [com.mark.war.War.main()] INFO com.mark.war.War - *** New Game ***
    53 [com.mark.war.War.main()] INFO com.mark.war.War - Dealing 52 cards to 4 players
    57 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of SPADES to player #0
    57 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of CLUBS to player #1
    57 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #2
    58 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of SPADES to player #3
    58 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of SPADES to player #0
    58 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of DIAMONDS to player #1
    58 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of SPADES to player #2
    58 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of SPADES to player #3
    58 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of CLUBS to player #0
    59 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of DIAMONDS to player #1
    60 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of SPADES to player #2
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of SPADES to player #3
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of DIAMONDS to player #0
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of HEARTS to player #1
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of HEARTS to player #2
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of HEARTS to player #3
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of DIAMONDS to player #0
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of HEARTS to player #1
    61 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of CLUBS to player #2
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of CLUBS to player #3
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of DIAMONDS to player #0
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of SPADES to player #1
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of CLUBS to player #2
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of HEARTS to player #3
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of DIAMONDS to player #0
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of CLUBS to player #1
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of CLUBS to player #2
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of CLUBS to player #3
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of HEARTS to player #0
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of DIAMONDS to player #1
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #2
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of HEARTS to player #3
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of HEARTS to player #0
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of SPADES to player #1
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of DIAMONDS to player #2
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of HEARTS to player #3
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of SPADES to player #0
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of HEARTS to player #1
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of CLUBS to player #2
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of SPADES to player #3
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of SPADES to player #0
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of DIAMONDS to player #1
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of DIAMONDS to player #2
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of CLUBS to player #3
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of CLUBS to player #0
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of HEARTS to player #1
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of HEARTS to player #2
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of HEARTS to player #3
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of CLUBS to player #0
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of SPADES to player #1
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of CLUBS to player #2
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of DIAMONDS to player #3
    66 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    77 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Four of CLUBS
    77 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Jack of SPADES
    77 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Queen of CLUBS
    77 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Six of DIAMONDS
    95 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #2 wins battle and adds 4 cards to stack
    96 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    97 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Nine of CLUBS
    97 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Three of HEARTS
    97 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Jack of HEARTS
    97 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Queen of HEARTS
    99 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 4 cards to stack
    99 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    99 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Five of SPADES
    99 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Three of DIAMONDS
    99 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Seven of DIAMONDS
    99 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Seven of CLUBS
    101 [com.mark.war.War.main()] INFO com.mark.war.War - !!!War!!!
    126 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    126 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Six of CLUBS
    126 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Seven of SPADES
    127 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 6 cards to stack
    127 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    127 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Two of SPADES
    127 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Six of HEARTS
    127 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Two of DIAMONDS
    127 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Two of HEARTS
    129 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
    129 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    129 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Seven of HEARTS
    129 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Six of SPADES
    129 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ace of DIAMONDS
    129 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Eight of HEARTS
    131 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 4 cards to stack
    131 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    131 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Ace of HEARTS
    131 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Five of DIAMONDS
    131 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Jack of CLUBS
    131 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Five of CLUBS
    132 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #2 wins battle and adds 4 cards to stack
    132 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    132 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Four of DIAMONDS
    132 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Eight of CLUBS
    132 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Three of CLUBS
    133 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Four of HEARTS
    133 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
    134 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    134 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays King of DIAMONDS
    134 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Four of SPADES
    134 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ace of CLUBS
    134 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Two of CLUBS
    135 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
    135 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    135 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Queen of DIAMONDS
    135 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Nine of HEARTS
    135 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ten of HEARTS
    135 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Five of HEARTS
    137 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
    137 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    137 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Ten of DIAMONDS
    137 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays King of HEARTS
    137 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Queen of SPADES
    137 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Ace of SPADES
    138 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
    138 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    138 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays King of CLUBS
    138 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Eight of DIAMONDS
    138 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Eight of SPADES
    138 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Nine of SPADES
    139 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
    139 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays King of SPADES
    139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Nine of DIAMONDS
    139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Jack of DIAMONDS
    139 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Ten of SPADES
    140 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
    140 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    140 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Three of SPADES
    140 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Ten of CLUBS
    141 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 2 cards to stack
    145 [com.mark.war.War.main()] INFO com.mark.war.War - Game ranking {16=[#Player: 0, #CardsInHand: [], #CardsInStack: 16, StackCards Detail: [Four of SPADES, King of DIAMONDS, Ace of CLUBS, Two of CLUBS, Nine of HEARTS, Queen of DIAMONDS, Ten of HEARTS, Five of HEARTS, Eight of DIAMONDS, King of CLUBS, Eight of SPADES, Nine of SPADES, Nine of DIAMONDS, King of SPADES, Jack of DIAMONDS, Ten of SPADES]], 14=[#Player: 1, #CardsInHand: [], #CardsInStack: 14, StackCards Detail: [Six of HEARTS, Two of SPADES, Two of DIAMONDS, Two of HEARTS, Eight of CLUBS, Four of DIAMONDS, Three of CLUBS, Four of HEARTS, King of HEARTS, Ten of DIAMONDS, Queen of SPADES, Ace of SPADES, Ten of CLUBS, Three of SPADES], #Player: 3, #CardsInHand: [], #CardsInStack: 14, StackCards Detail: [Three of HEARTS, Nine of CLUBS, Jack of HEARTS, Queen of HEARTS, Three of DIAMONDS, Five of SPADES, Seven of DIAMONDS, Seven of CLUBS, Six of CLUBS, Seven of SPADES, Six of SPADES, Seven of HEARTS, Ace of DIAMONDS, Eight of HEARTS]], 8=[#Player: 2, #CardsInHand: [], #CardsInStack: 8, StackCards Detail: [Jack of SPADES, Four of CLUBS, Queen of CLUBS, Six of DIAMONDS, Five of DIAMONDS, Ace of HEARTS, Jack of CLUBS, Five of CLUBS]]}
    145 [com.mark.war.War.main()] INFO com.mark.war.War - *** Player 0 wins with the highest stack count of 16 ***
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 2.577 s
    [INFO] Finished at: 2015-09-27T10:56:21-07:00
    [INFO] Final Memory: 11M/220M
    [INFO] ------------------------------------------------------------------------
