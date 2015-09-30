An implementation of the War card game
======================================

* Requires Java 8
* to build artifacts, run 'mvn clean package' 
* to run a sample game, 'java -jar ./target/WarCardGame.jar'
* to run the test suite, 'mvn test'


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
    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.198 sec
    Running com.mark.war.WarTest
    128 [main] INFO com.mark.war.Player - Dealing Four of CLUBS to player #1
    129 [main] INFO com.mark.war.Player - Dealing Three of SPADES to player #1
    130 [main] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #2
    131 [main] INFO com.mark.war.Player - Dealing Five of CLUBS to player #2
    132 [main] INFO com.mark.war.Player - Dealing Four of SPADES to player #3
    132 [main] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #3
    133 [main] INFO com.mark.war.DeckImpl - *** Creating Deck with 4 suits and 13 ranks ***
    134 [main] INFO com.mark.war.War - Dealing 52 cards to 3 players
    137 [main] INFO com.mark.war.Player - Dealing Ace of HEARTS to player #0
    137 [main] INFO com.mark.war.Player - Dealing Two of HEARTS to player #1
    137 [main] INFO com.mark.war.Player - Dealing Three of HEARTS to player #2
    138 [main] INFO com.mark.war.Player - Dealing Four of HEARTS to player #0
    138 [main] INFO com.mark.war.Player - Dealing Five of HEARTS to player #1
    138 [main] INFO com.mark.war.Player - Dealing Six of HEARTS to player #2
    138 [main] INFO com.mark.war.Player - Dealing Seven of HEARTS to player #0
    139 [main] INFO com.mark.war.Player - Dealing Eight of HEARTS to player #1
    139 [main] INFO com.mark.war.Player - Dealing Nine of HEARTS to player #2
    139 [main] INFO com.mark.war.Player - Dealing Ten of HEARTS to player #0
    139 [main] INFO com.mark.war.Player - Dealing Jack of HEARTS to player #1
    140 [main] INFO com.mark.war.Player - Dealing Queen of HEARTS to player #2
    140 [main] INFO com.mark.war.Player - Dealing King of HEARTS to player #0
    140 [main] INFO com.mark.war.Player - Dealing Ace of SPADES to player #1
    141 [main] INFO com.mark.war.Player - Dealing Two of SPADES to player #2
    141 [main] INFO com.mark.war.Player - Dealing Three of SPADES to player #0
    142 [main] INFO com.mark.war.Player - Dealing Four of SPADES to player #1
    142 [main] INFO com.mark.war.Player - Dealing Five of SPADES to player #2
    142 [main] INFO com.mark.war.Player - Dealing Six of SPADES to player #0
    143 [main] INFO com.mark.war.Player - Dealing Seven of SPADES to player #1
    143 [main] INFO com.mark.war.Player - Dealing Eight of SPADES to player #2
    143 [main] INFO com.mark.war.Player - Dealing Nine of SPADES to player #0
    143 [main] INFO com.mark.war.Player - Dealing Ten of SPADES to player #1
    144 [main] INFO com.mark.war.Player - Dealing Jack of SPADES to player #2
    144 [main] INFO com.mark.war.Player - Dealing Queen of SPADES to player #0
    144 [main] INFO com.mark.war.Player - Dealing King of SPADES to player #1
    144 [main] INFO com.mark.war.Player - Dealing Ace of CLUBS to player #2
    145 [main] INFO com.mark.war.Player - Dealing Two of CLUBS to player #0
    145 [main] INFO com.mark.war.Player - Dealing Three of CLUBS to player #1
    146 [main] INFO com.mark.war.Player - Dealing Four of CLUBS to player #2
    146 [main] INFO com.mark.war.Player - Dealing Five of CLUBS to player #0
    146 [main] INFO com.mark.war.Player - Dealing Six of CLUBS to player #1
    146 [main] INFO com.mark.war.Player - Dealing Seven of CLUBS to player #2
    146 [main] INFO com.mark.war.Player - Dealing Eight of CLUBS to player #0
    147 [main] INFO com.mark.war.Player - Dealing Nine of CLUBS to player #1
    147 [main] INFO com.mark.war.Player - Dealing Ten of CLUBS to player #2
    147 [main] INFO com.mark.war.Player - Dealing Jack of CLUBS to player #0
    147 [main] INFO com.mark.war.Player - Dealing Queen of CLUBS to player #1
    147 [main] INFO com.mark.war.Player - Dealing King of CLUBS to player #2
    148 [main] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #0
    148 [main] INFO com.mark.war.Player - Dealing Two of DIAMONDS to player #1
    148 [main] INFO com.mark.war.Player - Dealing Three of DIAMONDS to player #2
    148 [main] INFO com.mark.war.Player - Dealing Four of DIAMONDS to player #0
    149 [main] INFO com.mark.war.Player - Dealing Five of DIAMONDS to player #1
    149 [main] INFO com.mark.war.Player - Dealing Six of DIAMONDS to player #2
    149 [main] INFO com.mark.war.Player - Dealing Seven of DIAMONDS to player #0
    150 [main] INFO com.mark.war.Player - Dealing Eight of DIAMONDS to player #1
    150 [main] INFO com.mark.war.Player - Dealing Nine of DIAMONDS to player #2
    150 [main] INFO com.mark.war.Player - Dealing Ten of DIAMONDS to player #0
    150 [main] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #1
    150 [main] INFO com.mark.war.Player - Dealing Queen of DIAMONDS to player #2
    151 [main] INFO com.mark.war.War - New battle...
    168 [main] INFO com.mark.war.Player -    + Player #0 plays Ten of DIAMONDS
    168 [main] INFO com.mark.war.Player -    + Player #1 plays Jack of DIAMONDS
    168 [main] INFO com.mark.war.Player -    + Player #2 plays Queen of DIAMONDS
    171 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    173 [main] INFO com.mark.war.War - New battle...
    173 [main] INFO com.mark.war.Player -    + Player #0 plays Seven of DIAMONDS
    173 [main] INFO com.mark.war.Player -    + Player #1 plays Eight of DIAMONDS
    175 [main] INFO com.mark.war.Player -    + Player #2 plays Nine of DIAMONDS
    182 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    182 [main] INFO com.mark.war.War - New battle...
    183 [main] INFO com.mark.war.Player -    + Player #0 plays Four of DIAMONDS
    184 [main] INFO com.mark.war.Player -    + Player #1 plays Five of DIAMONDS
    184 [main] INFO com.mark.war.Player -    + Player #2 plays Six of DIAMONDS
    187 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    188 [main] INFO com.mark.war.War - New battle...
    189 [main] INFO com.mark.war.Player -    + Player #0 plays Ace of DIAMONDS
    190 [main] INFO com.mark.war.Player -    + Player #1 plays Two of DIAMONDS
    190 [main] INFO com.mark.war.Player -    + Player #2 plays Three of DIAMONDS
    192 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    192 [main] INFO com.mark.war.War - New battle...
    193 [main] INFO com.mark.war.Player -    + Player #0 plays Jack of CLUBS
    194 [main] INFO com.mark.war.Player -    + Player #1 plays Queen of CLUBS
    194 [main] INFO com.mark.war.Player -    + Player #2 plays King of CLUBS
    196 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    196 [main] INFO com.mark.war.War - New battle...
    197 [main] INFO com.mark.war.Player -    + Player #0 plays Eight of CLUBS
    197 [main] INFO com.mark.war.Player -    + Player #1 plays Nine of CLUBS
    197 [main] INFO com.mark.war.Player -    + Player #2 plays Ten of CLUBS
    203 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    203 [main] INFO com.mark.war.War - New battle...
    203 [main] INFO com.mark.war.Player -    + Player #0 plays Five of CLUBS
    207 [main] INFO com.mark.war.Player -    + Player #1 plays Six of CLUBS
    208 [main] INFO com.mark.war.Player -    + Player #2 plays Seven of CLUBS
    210 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    211 [main] INFO com.mark.war.War - New battle...
    212 [main] INFO com.mark.war.Player -    + Player #0 plays Two of CLUBS
    212 [main] INFO com.mark.war.Player -    + Player #1 plays Three of CLUBS
    212 [main] INFO com.mark.war.Player -    + Player #2 plays Four of CLUBS
    216 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    217 [main] INFO com.mark.war.War - New battle...
    218 [main] INFO com.mark.war.Player -    + Player #0 plays Queen of SPADES
    218 [main] INFO com.mark.war.Player -    + Player #1 plays King of SPADES
    218 [main] INFO com.mark.war.Player -    + Player #2 plays Ace of CLUBS
    224 [main] INFO com.mark.war.War - ...Player #1 wins battle and adds 3 cards to stack
    228 [main] INFO com.mark.war.War - New battle...
    229 [main] INFO com.mark.war.Player -    + Player #0 plays Nine of SPADES
    229 [main] INFO com.mark.war.Player -    + Player #1 plays Ten of SPADES
    230 [main] INFO com.mark.war.Player -    + Player #2 plays Jack of SPADES
    232 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    233 [main] INFO com.mark.war.War - New battle...
    233 [main] INFO com.mark.war.Player -    + Player #0 plays Six of SPADES
    233 [main] INFO com.mark.war.Player -    + Player #1 plays Seven of SPADES
    233 [main] INFO com.mark.war.Player -    + Player #2 plays Eight of SPADES
    235 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    236 [main] INFO com.mark.war.War - New battle...
    236 [main] INFO com.mark.war.Player -    + Player #0 plays Three of SPADES
    236 [main] INFO com.mark.war.Player -    + Player #1 plays Four of SPADES
    236 [main] INFO com.mark.war.Player -    + Player #2 plays Five of SPADES
    237 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    237 [main] INFO com.mark.war.War - New battle...
    238 [main] INFO com.mark.war.Player -    + Player #0 plays King of HEARTS
    239 [main] INFO com.mark.war.Player -    + Player #1 plays Ace of SPADES
    240 [main] INFO com.mark.war.Player -    + Player #2 plays Two of SPADES
    241 [main] INFO com.mark.war.War - ...Player #0 wins battle and adds 3 cards to stack
    242 [main] INFO com.mark.war.War - New battle...
    242 [main] INFO com.mark.war.Player -    + Player #0 plays Ten of HEARTS
    243 [main] INFO com.mark.war.Player -    + Player #1 plays Jack of HEARTS
    243 [main] INFO com.mark.war.Player -    + Player #2 plays Queen of HEARTS
    245 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    245 [main] INFO com.mark.war.War - New battle...
    246 [main] INFO com.mark.war.Player -    + Player #0 plays Seven of HEARTS
    246 [main] INFO com.mark.war.Player -    + Player #1 plays Eight of HEARTS
    246 [main] INFO com.mark.war.Player -    + Player #2 plays Nine of HEARTS
    248 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    248 [main] INFO com.mark.war.War - New battle...
    249 [main] INFO com.mark.war.Player -    + Player #0 plays Four of HEARTS
    249 [main] INFO com.mark.war.Player -    + Player #1 plays Five of HEARTS
    249 [main] INFO com.mark.war.Player -    + Player #2 plays Six of HEARTS
    251 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    251 [main] INFO com.mark.war.War - New battle...
    251 [main] INFO com.mark.war.Player -    + Player #0 plays Ace of HEARTS
    252 [main] INFO com.mark.war.Player -    + Player #1 plays Two of HEARTS
    252 [main] INFO com.mark.war.Player -    + Player #2 plays Three of HEARTS
    253 [main] INFO com.mark.war.War - ...Player #2 wins battle and adds 3 cards to stack
    256 [main] INFO com.mark.war.War - Game ranking {45=[#Player: 2, #CardsInHand: [], #CardsInStack: 45, StackCards Detail: [Jack of DIAMONDS, Queen of DIAMONDS, Ten of DIAMONDS, Eight of DIAMONDS, Nine of DIAMONDS, Seven of DIAMONDS, Five of DIAMONDS, Six of DIAMONDS, Four of DIAMONDS, Two of DIAMONDS, Three of DIAMONDS, Ace of DIAMONDS, Queen of CLUBS, King of CLUBS, Jack of CLUBS, Nine of CLUBS, Ten of CLUBS, Eight of CLUBS, Six of CLUBS, Seven of CLUBS, Five of CLUBS, Three of CLUBS, Four of CLUBS, Two of CLUBS, Ten of SPADES, Jack of SPADES, Nine of SPADES, Seven of SPADES, Eight of SPADES, Six of SPADES, Four of SPADES, Five of SPADES, Three of SPADES, Jack of HEARTS, Queen of HEARTS, Ten of HEARTS, Eight of HEARTS, Nine of HEARTS, Seven of HEARTS, Five of HEARTS, Six of HEARTS, Four of HEARTS, Two of HEARTS, Three of HEARTS, Ace of HEARTS]], 3=[#Player: 0, #CardsInHand: [], #CardsInStack: 3, StackCards Detail: [Ace of SPADES, Two of SPADES, King of HEARTS], #Player: 1, #CardsInHand: [], #CardsInStack: 3, StackCards Detail: [King of SPADES, Ace of CLUBS, Queen of SPADES]]}
    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.182 sec
    
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
    58 [com.mark.war.War.main()] INFO com.mark.war.DeckImpl - *** Shuffle Deck ***
    59 [com.mark.war.War.main()] INFO com.mark.war.War - *** New Game ***
    59 [com.mark.war.War.main()] INFO com.mark.war.War - Dealing 52 cards to 4 players
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of SPADES to player #0
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of HEARTS to player #1
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of HEARTS to player #2
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of SPADES to player #3
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of SPADES to player #0
    62 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of HEARTS to player #1
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of DIAMONDS to player #2
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of DIAMONDS to player #3
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of DIAMONDS to player #0
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of HEARTS to player #1
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of CLUBS to player #2
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of HEARTS to player #3
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of SPADES to player #0
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of DIAMONDS to player #1
    63 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of SPADES to player #2
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of DIAMONDS to player #3
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of DIAMONDS to player #0
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of HEARTS to player #1
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of SPADES to player #2
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of DIAMONDS to player #3
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of CLUBS to player #0
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of HEARTS to player #1
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of CLUBS to player #2
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of DIAMONDS to player #3
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of HEARTS to player #0
    64 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of CLUBS to player #1
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of HEARTS to player #2
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of HEARTS to player #3
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Four of CLUBS to player #0
    65 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of CLUBS to player #1
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of CLUBS to player #2
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of SPADES to player #3
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ten of DIAMONDS to player #0
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of CLUBS to player #1
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of SPADES to player #2
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of CLUBS to player #3
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Jack of HEARTS to player #0
    66 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of DIAMONDS to player #1
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Seven of CLUBS to player #2
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing King of SPADES to player #3
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of SPADES to player #0
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of HEARTS to player #1
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Two of HEARTS to player #2
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of CLUBS to player #3
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Queen of CLUBS to player #0
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Three of SPADES to player #1
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Ace of SPADES to player #2
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of CLUBS to player #3
    67 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Six of SPADES to player #0
    68 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Five of DIAMONDS to player #1
    68 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Nine of DIAMONDS to player #2
    68 [com.mark.war.War.main()] INFO com.mark.war.Player - Dealing Eight of DIAMONDS to player #3
    68 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    80 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Six of SPADES
    80 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Five of DIAMONDS
    80 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Nine of DIAMONDS
    80 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Eight of DIAMONDS
    99 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #2 wins battle and adds 4 cards to stack
    101 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    101 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Queen of CLUBS
    101 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Three of SPADES
    101 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ace of SPADES
    101 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Five of CLUBS
    104 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
    104 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    104 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Queen of SPADES
    104 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Queen of HEARTS
    104 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Two of HEARTS
    105 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Nine of CLUBS
    106 [com.mark.war.War.main()] INFO com.mark.war.War - !!!War!!!
    107 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    107 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Jack of HEARTS
    107 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays King of DIAMONDS
    108 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 6 cards to stack
    108 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    108 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Ten of DIAMONDS
    108 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Six of CLUBS
    108 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Seven of CLUBS
    108 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays King of SPADES
    110 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 4 cards to stack
    110 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    110 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Four of CLUBS
    110 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Two of CLUBS
    110 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Jack of SPADES
    110 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Jack of CLUBS
    112 [com.mark.war.War.main()] INFO com.mark.war.War - !!!War!!!
    112 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    112 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Eight of CLUBS
    112 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Seven of SPADES
    113 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #2 wins battle and adds 6 cards to stack
    113 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    113 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Ten of HEARTS
    114 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Ten of CLUBS
    114 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Six of HEARTS
    114 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Seven of HEARTS
    115 [com.mark.war.War.main()] INFO com.mark.war.War - !!!War!!!
    115 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    115 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays King of CLUBS
    115 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Ace of HEARTS
    116 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 6 cards to stack
    116 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    116 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Three of DIAMONDS
    116 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Eight of HEARTS
    116 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ace of CLUBS
    116 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Seven of DIAMONDS
    118 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
    118 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    118 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Nine of SPADES
    118 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Four of DIAMONDS
    118 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Two of SPADES
    119 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Jack of DIAMONDS
    120 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 4 cards to stack
    120 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    120 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Queen of DIAMONDS
    120 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays King of HEARTS
    120 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Ten of SPADES
    120 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Ace of DIAMONDS
    121 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #1 wins battle and adds 4 cards to stack
    121 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    121 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Five of SPADES
    121 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Five of HEARTS
    121 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Three of CLUBS
    121 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Nine of HEARTS
    122 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 4 cards to stack
    122 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    122 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #0 plays Eight of SPADES
    122 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #1 plays Four of HEARTS
    123 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Six of DIAMONDS
    123 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Two of DIAMONDS
    123 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #0 wins battle and adds 4 cards to stack
    124 [com.mark.war.War.main()] INFO com.mark.war.War - New battle...
    124 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #2 plays Three of HEARTS
    124 [com.mark.war.War.main()] INFO com.mark.war.Player -    + Player #3 plays Four of SPADES
    124 [com.mark.war.War.main()] INFO com.mark.war.War - ...Player #3 wins battle and adds 2 cards to stack
    128 [com.mark.war.War.main()] INFO com.mark.war.War - Game ranking {14=[#Player: 0, #CardsInHand: [], #CardsInStack: 14, StackCards Detail: [Five of CLUBS, Ace of SPADES, Three of SPADES, Queen of CLUBS, Seven of HEARTS, Six of HEARTS, Ten of CLUBS, Ten of HEARTS, Ace of HEARTS, King of CLUBS, Two of DIAMONDS, Six of DIAMONDS, Four of HEARTS, Eight of SPADES], #Player: 1, #CardsInHand: [], #CardsInStack: 14, StackCards Detail: [Nine of CLUBS, Two of HEARTS, Queen of HEARTS, Queen of SPADES, King of DIAMONDS, Jack of HEARTS, Seven of DIAMONDS, Ace of CLUBS, Eight of HEARTS, Three of DIAMONDS, Ace of DIAMONDS, Ten of SPADES, King of HEARTS, Queen of DIAMONDS], #Player: 3, #CardsInHand: [], #CardsInStack: 14, StackCards Detail: [King of SPADES, Seven of CLUBS, Six of CLUBS, Ten of DIAMONDS, Jack of DIAMONDS, Two of SPADES, Four of DIAMONDS, Nine of SPADES, Nine of HEARTS, Three of CLUBS, Five of HEARTS, Five of SPADES, Four of SPADES, Three of HEARTS]], 10=[#Player: 2, #CardsInHand: [], #CardsInStack: 10, StackCards Detail: [Eight of DIAMONDS, Nine of DIAMONDS, Five of DIAMONDS, Six of SPADES, Jack of CLUBS, Jack of SPADES, Two of CLUBS, Four of CLUBS, Seven of SPADES, Eight of CLUBS]]}
    128 [com.mark.war.War.main()] INFO com.mark.war.War - *** Player 0 wins with the highest stack count of 14 ***
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 2.566 s
    [INFO] Finished at: 2015-09-30T14:28:41-07:00
    [INFO] Final Memory: 10M/155M
    [INFO] ------------------------------------------------------------------------

