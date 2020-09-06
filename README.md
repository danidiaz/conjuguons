# conjuguons
Conjuguons! \kɔ̃.jy.ɡɔ̃\

## resources

[GLAWI](https://twitter.com/DiazCarrete/status/1164939319049633792). [documentation en ligne](http://redac.univ-tlse2.fr/lexicons/glawi/doc/index.html)

> GLAWI est un dictionnaire électronique libre du français encodé au format XML. Il s'agit d'une version structurée et normalisée du Wiktionnaire

[G-PeTo](http://redac.univ-tlse2.fr/lexicons/glawi/tools/g-peto.html)

> G-PeTo (GLAWI Perl Tools) est un ensemble de programmes que nous diffusons pour permettre la manipulation de GLAWI, en particulier l'extraction de sous-lexiques et de contenus spécifiques. Les scripts peuvent être utilisés en l'état ou adaptés par vos soins à vos besoins particuliers.
 
> The first list of programs is made of quick-and-dirty scripts (quickly written, but also running faster than those using SAX/DOM parsing) that do not require any specific module installation and should run under any OS with Perl installed. They are also easy to modify if needed, with few programming skills.
> The programs perform a line-by-line reading of GLAWI and allow an extraction of one or several titles (headwords) or articles in XML format (intended e.g. to be transformed with an XSL sheet, manually browsed or further queried by any program).

> The programs using XML::DOM first work like SAX-parsers in order to build the textual content of a given article and then build a DOM document of the current article (discarding the DOM of the previous article). Once the DOM built, the search/extraction is performed.

[Ne jetons pas le Wiktionnaire avec l’oripeau du Web ! Études et réalisations fondées sur le dictionnaire collaboratif](https://www.shs-conferences.org/articles/shsconf/pdf/2014/05/shsconf_cmlf14_01216.pdf)

[GLAWI pos](http://redac.univ-tlse2.fr/lexicons/glawi/doc/pos.html)

> The basic unit of Wiktionnaire's articles is the written form (grapheme). A given article may contain several entries having identical or distinct parts of speech (POSs). A POS section may correspond to a canonical form (lemma) or to an inflection.

> homoNb: homograph number, present when several POS sections correspond to the same syntactic category (e.g. three noun POS sections in the article mousse), absent otherwise.

[GLAWI inflectionInfos](http://redac.univ-tlse2.fr/lexicons/glawi/doc/paradigmsAndInflections.html)

> when a POS section describes one or several inflected forms, the inflectionInfos element enumerates the morphosyntactic features of the forms and their lemmas.

> The gracePOS attribute given in inflectedForm and inflection follow the GRACE format (Rajman et al., 1997). It is used for nouns, verbs and adjectives as described below.

> Vmn----	Infinitive
> Vmpp---	Present participle
> Vm-ps-[sp][mf]	Past participle
> + number attribute [s/p]
> + gender attribute [m/f]
> Vm[ism][pifs][123][sp]-	Inflected verb form
> + mood (i: indicative, s: subjunctive, m: imperative)
> + tense (p: present, i: imperfect, f: future, s: past)
> + person ([123])
> + number (s: singular, p: plural)

> Rajman, M., Lecomte, J., and Paroubek, P. (1997). Format de description lexicale pour le français. Partie 2 : Description morpho-syntaxique. Technical report, EPFL & INaLF. GRACE GTR-3-2.1.

[GLAWI paradigm](http://redac.univ-tlse2.fr/lexicons/glawi/doc/paradigmsAndInflections.html)

> paradigm: when a POS section describes a lemma, the inflectional paradigm element and its inflection children give all the inflected forms of the paradigm (when they are present in Wiktionnaire). 

> When a POS section describes one or several inflected forms, the inflectionInfos element enumerates the morphosyntactic features of the forms and their lemmas. When it describes a lemma, the inflectional paradigm element and its inflection children give all the inflected forms of the paradigm (when they are present in Wiktionnaire).

Entry for an infinitive:

    <article>
      <title>reramasser</title>
      <pageId>1602455</pageId>
      <meta/>
      <text>
        <etymology>
          <etym>
            <xml>de <i><innerLink ref="ramasser">ramasser</innerLink></i>, avec le préfixe <innerLink ref="re-">re-</innerLink>.</xml>
            <txt>de ramasser, avec le préfixe re-.</txt>
          </etym>
        </etymology>
        <pos type="verbe" lemma="1" locution="0">
          <pronunciations>
            <pron>ʁə.ʁa.ma.se</pron>
          </pronunciations>
          <paradigm>
            <inflection form="reramassas" gracePOS="Vmis2s-" prons="ʁə.ʁa.ma.sa"/>
            <inflection form="reramassâmes" gracePOS="Vmis1p-" prons="ʁə.ʁa.ma.sam"/>
            <inflection form="reramassassions" gracePOS="Vmsi1p-" prons="ʁə.ʁa.ma.sa.sjɔ̃"/>
            <inflection form="reramassât" gracePOS="Vmsi3s-" prons="ʁə.ʁa.ma.sa"/>
            <inflection form="reramasse" gracePOS="Vmsp1s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassiez" gracePOS="Vmii2p-" prons="ʁə.ʁa.ma.sje"/>
            <inflection form="reramassassiez" gracePOS="Vmsi2p-" prons="ʁə.ʁa.ma.sa.sje"/>
            <inflection form="reramasseras" gracePOS="Vmif2s-" prons="ʁə.ʁa.ma.sə.ʁa"/>
            <inflection form="reramassai" gracePOS="Vmis1s-" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassasses" gracePOS="Vmsi2s-" prons="ʁə.ʁa.ma.sas"/>
            <inflection form="reramassent" gracePOS="Vmsp3p-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassiez" gracePOS="Vmsp2p-" prons="ʁə.ʁa.ma.sje"/>
            <inflection form="reramasserai" gracePOS="Vmif1s-" prons="ʁə.ʁa.ma.sə.ʁe"/>
            <inflection form="reramasserez" gracePOS="Vmif2p-" prons="ʁə.ʁa.ma.sə.ʁe"/>
            <inflection form="reramassassent" gracePOS="Vmsi3p-" prons="ʁə.ʁa.ma.sas"/>
            <inflection form="reramassâtes" gracePOS="Vmis2p-" prons="ʁə.ʁa.ma.sat"/>
            <inflection form="reramassions" gracePOS="Vmsp1p-" prons="ʁə.ʁa.ma.sjɔ̃"/>
            <inflection form="reramasse" gracePOS="Vmip3s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassée" gracePOS="Vmps-sf" prons=""/>
            <inflection form="reramasse" gracePOS="Vmsp3s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassais" gracePOS="Vmii2s-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramassaient" gracePOS="Vmii3p-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramassé" gracePOS="Vmps-sm" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramasseraient" gracePOS="Vmcp3p-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
            <inflection form="reramasse" gracePOS="Vmip1s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramasserions" gracePOS="Vmcp1p-" prons="ʁə.ʁa.ma.sə.ʁjɔ̃"/>
            <inflection form="reramassons" gracePOS="Vmip1p-" prons="ʁə.ʁa.ma.sɔ̃"/>
            <inflection form="reramasseront" gracePOS="Vmif3p-" prons="ʁə.ʁa.ma.sə.ʁɔ̃"/>
            <inflection form="reramassés" gracePOS="Vmps-pm" prons=""/>
            <inflection form="reramassez" gracePOS="Vmmp2p-" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassez" gracePOS="Vmip2p-" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassées" gracePOS="Vmps-pf" prons=""/>
            <inflection form="reramasses" gracePOS="Vmip2s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassions" gracePOS="Vmii1p-" prons="ʁə.ʁa.ma.sjɔ̃"/>
            <inflection form="reramassera" gracePOS="Vmif3s-" prons="ʁə.ʁa.ma.sə.ʁa"/>
            <inflection form="reramasserais" gracePOS="Vmcp1s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
            <inflection form="reramasserait" gracePOS="Vmcp3s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
            <inflection form="reramasses" gracePOS="Vmsp2s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassent" gracePOS="Vmip3p-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramassant" gracePOS="Vmpp---" prons="ʁə.ʁa.ma.sã"/>
            <inflection form="reramassa" gracePOS="Vmis3s-" prons="ʁə.ʁa.ma.sa"/>
            <inflection form="reramassasse" gracePOS="Vmsi1s-" prons="ʁə.ʁa.ma.sas"/>
            <inflection form="reramassons" gracePOS="Vmmp1p-" prons="ʁə.ʁa.ma.sɔ̃"/>
            <inflection form="reramasser" gracePOS="Vmn----" prons="ʁə.ʁa.ma.se"/>
            <inflection form="reramassèrent" gracePOS="Vmis3p-" prons="ʁə.ʁa.ma.sɛʁ"/>
            <inflection form="reramasseriez" gracePOS="Vmcp2p-" prons="ʁə.ʁa.ma.sə.ʁje"/>
            <inflection form="reramassait" gracePOS="Vmii3s-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramassais" gracePOS="Vmii1s-" prons="ʁə.ʁa.ma.sɛ"/>
            <inflection form="reramasserons" gracePOS="Vmif1p-" prons="ʁə.ʁa.ma.sə.ʁɔ̃"/>
            <inflection form="reramasse" gracePOS="Vmmp2s-" prons="ʁə.ʁa.mas"/>
            <inflection form="reramasserais" gracePOS="Vmcp2s-" prons="ʁə.ʁa.ma.sə.ʁɛ"/>
          </paradigm>
          <definitions>
            <definition>
              <gloss>
                <xml><innerLink ref="ramasser">Ramasser</innerLink><innerLink ref="à nouveau">à nouveau</innerLink>.</xml>
                <txt>Ramasser à nouveau.</txt>
              </gloss>
              <example>
                <xml>
                  <i>Je finis de bouffer, et je reviens au boulot, <b>reramasser</b> des prunes.</i>
                </xml>
                <txt>Je finis de bouffer, et je reviens au boulot, reramasser des prunes.</txt>
              </example>
            </definition>
          </definitions>
        </pos>
      </text>
    </article>

Entry for a conjugated form:

    <article>
      <title>reramasserait</title>
      <pageId>1602958</pageId>
      <meta/>
      <text>
        <pos type="verbe" lemma="0" locution="0">
          <pronunciations>
            <pron>ʁə.ʁa.ma.sə.ʁɛ</pron>
          </pronunciations>
          <inflectionInfos>
            <inflectedForm gracePOS="Vmcp3s-" lemma="reramasser"/>
          </inflectionInfos>
          <definitions>
            <definition>
              <gloss>
                <xml><i>Troisième personne du singulier du conditionnel présent du verbe</i><innerLink ref="reramasser">reramasser</innerLink>.</xml>
                <txt>Troisième personne du singulier du conditionnel présent du verbe reramasser.</txt>
              </gloss>
            </definition>
          </definitions>
        </pos>
      </text>
    </article>

Entries for a two-form verb. Notice the multiple values for a "coordinate" in the paradigm tag:

    <article>
      <title>asseoir</title>
      <pageId>119764</pageId>
      <meta>
        <category>Rectifications orthographiques du français en 1990</category>
        <import>DAF8</import>
      </meta>
      <text>
        <pronunciations>
          <pron area="Canada">a.swɔːʁ</pron>
          <pron>a.swaʁ</pron>
          <pron area="France Paris">a.swaʁ</pron>
          <pron area="Canada">a.swɛːʁ</pron>
          <pron area="Canada">a.swɑːʁ</pron>
        </pronunciations>
        <etymology>
          <etym>
            <xml>du latin <foreignWord lang="la">assidere</foreignWord>.</xml>
            <txt>du latin assidere .</txt>
          </etym>
        </etymology>
        <pos type="verbe" lemma="1" locution="0">
          <pronunciations>
            <pron>a.swaʁ</pron>
          </pronunciations>
          <paradigm>
            <inflection form="asseyent" gracePOS="Vmsp3p-" prons="a.sɛj"/>
            <inflection form="assoient" gracePOS="Vmsp3p-" prons="a.swa"/>
            <inflection form="assieds" gracePOS="Vmip2s-" prons="a.sje"/>
            <inflection form="assois" gracePOS="Vmip2s-" prons="a.swa"/>
            <inflection form="assis" gracePOS="Vmps-sm" prons="a.si"/>
            <inflection form="assiérais" gracePOS="Vmcp1s-" prons="a.sje.ʁɛ"/>
            <inflection form="assoirais" gracePOS="Vmcp1s-" prons="a.swa.ʁɛ"/>
            <inflection form="assises" gracePOS="Vmps-pf" prons=""/>
            <inflection form="asseyaient" gracePOS="Vmii3p-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyaient" gracePOS="Vmii3p-" prons="a.swa.jɛ"/>
            <inflection form="asseyiez" gracePOS="Vmsp2p-" prons="a.sɛj.je"/>
            <inflection form="assoyiez" gracePOS="Vmsp2p-" prons="a.swaj.je"/>
            <inflection form="assiéras" gracePOS="Vmif2s-" prons="a.sje.ʁa"/>
            <inflection form="assoiras" gracePOS="Vmif2s-" prons="a.swa.ʁa"/>
            <inflection form="asseoir" gracePOS="Vmn----" prons="a.swaʁ"/>
            <inflection form="asseyons" gracePOS="Vmip1p-" prons="a.sɛ.jɔ̃"/>
            <inflection form="assoyons" gracePOS="Vmip1p-" prons="a.swa.jɔ̃"/>
            <inflection form="assît" gracePOS="Vmsi3s-" prons="a.si"/>
            <inflection form="assîmes" gracePOS="Vmis1p-" prons="a.sim"/>
            <inflection form="assit" gracePOS="Vmis3s-" prons="a.si"/>
            <inflection form="assis" gracePOS="Vmis1s-" prons="a.si"/>
            <inflection form="assiérait" gracePOS="Vmcp3s-" prons="a.sje.ʁɛ"/>
            <inflection form="assoirait" gracePOS="Vmcp3s-" prons="a.swa.ʁɛ"/>
            <inflection form="assissions" gracePOS="Vmsi1p-" prons="a.si.sjɔ̃"/>
            <inflection form="asseyons" gracePOS="Vmmp1p-" prons="a.sɛ.jɔ̃"/>
            <inflection form="assoyons" gracePOS="Vmmp1p-" prons="a.swa.jɔ̃"/>
            <inflection form="asseyait" gracePOS="Vmii3s-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyait" gracePOS="Vmii3s-" prons="a.swa.jɛ"/>
            <inflection form="assise" gracePOS="Vmps-sf" prons=""/>
            <inflection form="asseye" gracePOS="Vmsp1s-" prons="a.sɛj"/>
            <inflection form="assoie" gracePOS="Vmsp1s-" prons="a.swa"/>
            <inflection form="assieds" gracePOS="Vmip1s-" prons="a.sje"/>
            <inflection form="assois" gracePOS="Vmip1s-" prons="a.swa"/>
            <inflection form="asseyais" gracePOS="Vmii2s-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyais" gracePOS="Vmii2s-" prons="a.swa.jɛ"/>
            <inflection form="assiérai" gracePOS="Vmif1s-" prons="a.sje.ʁe"/>
            <inflection form="assoirai" gracePOS="Vmif1s-" prons="a.swa.ʁe"/>
            <inflection form="assîtes" gracePOS="Vmis2p-" prons="a.sit"/>
            <inflection form="assis" gracePOS="Vmis2s-" prons="a.si"/>
            <inflection form="assiérais" gracePOS="Vmcp2s-" prons="a.sje.ʁɛ"/>
            <inflection form="assoirais" gracePOS="Vmcp2s-" prons="a.swa.ʁɛ"/>
            <inflection form="asseye" gracePOS="Vmsp3s-" prons="a.sɛj"/>
            <inflection form="assoie" gracePOS="Vmsp3s-" prons="a.swa"/>
            <inflection form="assiérions" gracePOS="Vmcp1p-" prons="a.sje.ʁjɔ̃"/>
            <inflection form="assoirions" gracePOS="Vmcp1p-" prons="a.swa.ʁjɔ̃"/>
            <inflection form="assied" gracePOS="Vmip3s-" prons="a.sje"/>
            <inflection form="assoit" gracePOS="Vmip3s-" prons="a.swa"/>
            <inflection form="assiéront" gracePOS="Vmif3p-" prons="a.sje.ʁɔ̃"/>
            <inflection form="assoiront" gracePOS="Vmif3p-" prons="a.swa.ʁɔ̃"/>
            <inflection form="asseyes" gracePOS="Vmsp2s-" prons="a.sɛj"/>
            <inflection form="assoies" gracePOS="Vmsp2s-" prons="a.swa"/>
            <inflection form="assis" gracePOS="Vmps-pm" prons=""/>
            <inflection form="asseyez" gracePOS="Vmmp2p-" prons="a.sɛ.je"/>
            <inflection form="assoyez" gracePOS="Vmmp2p-" prons="a.swa.je"/>
            <inflection form="asseyions" gracePOS="Vmsp1p-" prons="a.sɛj.jɔ̃"/>
            <inflection form="assoyions" gracePOS="Vmsp1p-" prons="a.swaj.jɔ̃"/>
            <inflection form="assirent" gracePOS="Vmis3p-" prons="a.siʁ"/>
            <inflection form="assisses" gracePOS="Vmsi2s-" prons="a.sis"/>
            <inflection form="asseyais" gracePOS="Vmii1s-" prons="a.sɛ.jɛ"/>
            <inflection form="assoyais" gracePOS="Vmii1s-" prons="a.swa.jɛ"/>
            <inflection form="asseyant" gracePOS="Vmpp---" prons="a.sɛ.jã"/>
            <inflection form="assoyant" gracePOS="Vmpp---" prons="a.swa.jã"/>
            <inflection form="assieds" gracePOS="Vmmp2s-" prons="a.sje"/>
            <inflection form="assois" gracePOS="Vmmp2s-" prons="a.swa"/>
            <inflection form="asseyez" gracePOS="Vmip2p-" prons="a.sɛ.je"/>
            <inflection form="assoyez" gracePOS="Vmip2p-" prons="a.swa.je"/>
            <inflection form="assiéraient" gracePOS="Vmcp3p-" prons="a.sje.ʁɛ"/>
            <inflection form="assoiraient" gracePOS="Vmcp3p-" prons="a.swa.ʁɛ"/>
            <inflection form="asseyions" gracePOS="Vmii1p-" prons="a.sɛj.jɔ̃"/>
            <inflection form="assoyions" gracePOS="Vmii1p-" prons="a.swaj.jɔ̃"/>
            <inflection form="assissent" gracePOS="Vmsi3p-" prons="a.sis"/>
            <inflection form="asseyent" gracePOS="Vmip3p-" prons="a.sɛj"/>
            <inflection form="assoient" gracePOS="Vmip3p-" prons="a.swa"/>
            <inflection form="assissiez" gracePOS="Vmsi2p-" prons="a.si.sje"/>
            <inflection form="assiérons" gracePOS="Vmif1p-" prons="a.sje.ʁɔ̃"/>
            <inflection form="assoirons" gracePOS="Vmif1p-" prons="a.swa.ʁɔ̃"/>
            <inflection form="assisse" gracePOS="Vmsi1s-" prons="a.sis"/>
            <inflection form="asseyiez" gracePOS="Vmii2p-" prons="a.sɛj.je"/>
            <inflection form="assoyiez" gracePOS="Vmii2p-" prons="a.swaj.je"/>
            <inflection form="assiériez" gracePOS="Vmcp2p-" prons="a.sje.ʁje"/>
            <inflection form="assoiriez" gracePOS="Vmcp2p-" prons="a.swa.ʁje"/>
            <inflection form="assiéra" gracePOS="Vmif3s-" prons="a.sje.ʁa"/>
            <inflection form="assoira" gracePOS="Vmif3s-" prons="a.swa.ʁa"/>
            <inflection form="assiérez" gracePOS="Vmif2p-" prons="a.sje.ʁe"/>
            <inflection form="assoirez" gracePOS="Vmif2p-" prons="a.swa.ʁe"/>
          </paradigm>

How are pronominal verbs handled? 

A word like "reposer" can have *multiple* POS associated (with different homoNb attributes). 

Each POS has its paradigm, and one or more definitions. Inside the definitions,
label elements of type "gram" can have values like pronominal, intrasitif,
transitif...

      <pos type="verbe" lemma="1" locution="0" homoNb="2">
        <pronunciations>
          <pron>ʁə.po.ze</pron>
        </pronunciations>
        <paradigm>
          <inflection form="reposes" gracePOS="Vmsp2s-" prons="ʁə.poz"/>
          <inflection form="reposons" gracePOS="Vmip1p-" prons="ʁə.po.zɔ̃"/>
          <inflection form="reposassions" gracePOS="Vmsi1p-" prons="ʁə.po.za.sjɔ̃"/>
          <inflection form="reposez" gracePOS="Vmip2p-" prons="ʁə.po.ze"/>
          <inflection form="reposait" gracePOS="Vmii3s-" prons="ʁə.po.zɛ"/>
          <inflection form="repose" gracePOS="Vmsp1s-" prons="ʁə.poz"/>
          <inflection form="repose" gracePOS="Vmip3s-" prons="ʁə.poz"/>
          <inflection form="reposés" gracePOS="Vmps-pm" prons=""/>
          <inflection form="reposez" gracePOS="Vmmp2p-" prons="ʁə.po.ze"/>
          <inflection form="reposèrent" gracePOS="Vmis3p-" prons="ʁə.po.zɛʁ"/>
          <inflection form="reposeras" gracePOS="Vmif2s-" prons="ʁə.po.zə.ʁa"/>
          <inflection form="reposons" gracePOS="Vmmp1p-" prons="ʁə.po.zɔ̃"/>
          <inflection form="reposai" gracePOS="Vmis1s-" prons="ʁə.po.ze"/>
          <inflection form="reposes" gracePOS="Vmip2s-" prons="ʁə.poz"/>
          <inflection form="reposée" gracePOS="Vmps-sf" prons=""/>
          <inflection form="reposasses" gracePOS="Vmsi2s-" prons="ʁə.po.zas"/>
          <inflection form="reposiez" gracePOS="Vmii2p-" prons="ʁə.po.zje"/>
          <inflection form="reposa" gracePOS="Vmis3s-" prons="ʁə.po.za"/>
          <inflection form="reposassent" gracePOS="Vmsi3p-" prons="ʁə.po.zas"/>
          <inflection form="reposerais" gracePOS="Vmcp1s-" prons="ʁə.po.zə.ʁɛ"/>
          <inflection form="reposerions" gracePOS="Vmcp1p-" prons="ʁə.po.zə.ʁjɔ̃"/>
          <inflection form="reposeront" gracePOS="Vmif3p-" prons="ʁə.po.zə.ʁɔ̃"/>
          <inflection form="reposais" gracePOS="Vmii1s-" prons="ʁə.po.zɛ"/>
          <inflection form="reposâmes" gracePOS="Vmis1p-" prons="ʁə.po.zam"/>
          <inflection form="reposâtes" gracePOS="Vmis2p-" prons="ʁə.po.zat"/>
          <inflection form="reposas" gracePOS="Vmis2s-" prons="ʁə.po.za"/>
          <inflection form="reposerais" gracePOS="Vmcp2s-" prons="ʁə.po.zə.ʁɛ"/>
          <inflection form="reposaient" gracePOS="Vmii3p-" prons="ʁə.po.zɛ"/>
          <inflection form="reposera" gracePOS="Vmif3s-" prons="ʁə.po.zə.ʁa"/>
          <inflection form="reposasse" gracePOS="Vmsi1s-" prons="ʁə.po.zas"/>
          <inflection form="reposées" gracePOS="Vmps-pf" prons=""/>
          <inflection form="reposent" gracePOS="Vmip3p-" prons="ʁə.poz"/>
          <inflection form="repose" gracePOS="Vmip1s-" prons="ʁə.poz"/>
          <inflection form="reposiez" gracePOS="Vmsp2p-" prons="ʁə.po.zje"/>
          <inflection form="reposé" gracePOS="Vmps-sm" prons="ʁə.po.ze"/>
          <inflection form="reposerait" gracePOS="Vmcp3s-" prons="ʁə.po.zə.ʁɛ"/>
          <inflection form="reposât" gracePOS="Vmsi3s-" prons="ʁə.po.za"/>
          <inflection form="reposer" gracePOS="Vmn----" prons="ʁə.po.ze"/>
          <inflection form="reposant" gracePOS="Vmpp---" prons="ʁə.po.zã"/>
          <inflection form="reposions" gracePOS="Vmii1p-" prons="ʁə.po.zjɔ̃"/>
          <inflection form="reposassiez" gracePOS="Vmsi2p-" prons="ʁə.po.za.sje"/>
          <inflection form="reposeriez" gracePOS="Vmcp2p-" prons="ʁə.po.zə.ʁje"/>
          <inflection form="reposerez" gracePOS="Vmif2p-" prons="ʁə.po.zə.ʁe"/>
          <inflection form="reposais" gracePOS="Vmii2s-" prons="ʁə.po.zɛ"/>
          <inflection form="repose" gracePOS="Vmsp3s-" prons="ʁə.poz"/>
          <inflection form="reposions" gracePOS="Vmsp1p-" prons="ʁə.po.zjɔ̃"/>
          <inflection form="reposerons" gracePOS="Vmif1p-" prons="ʁə.po.zə.ʁɔ̃"/>
          <inflection form="repose" gracePOS="Vmmp2s-" prons="ʁə.poz"/>
          <inflection form="reposerai" gracePOS="Vmif1s-" prons="ʁə.po.zə.ʁe"/>
          <inflection form="reposent" gracePOS="Vmsp3p-" prons="ʁə.poz"/>
          <inflection form="reposeraient" gracePOS="Vmcp3p-" prons="ʁə.po.zə.ʁɛ"/>
        </paradigm>
        <definitions>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="transitif"/>
              </labels>
              <xml><innerLink ref="mettre">Mettre</innerLink> dans une <innerLink ref="situation">situation</innerLink> <innerLink ref="tranquille">tranquille</innerLink>, mettre en <innerLink ref="état">état</innerLink> de <innerLink ref="repos">repos</innerLink>, pour <innerLink ref="délasser">délasser</innerLink>, pour <innerLink ref="détendre">détendre</innerLink>.</xml>
              <txt>Mettre dans une situation tranquille, mettre en état de repos, pour délasser, pour détendre.</txt>
            </gloss>
            <example>
              <xml>
                <i><b>reposer</b> sa jambe sur un tabouret.</i>
              </xml>
              <txt>reposer sa jambe sur un tabouret.</txt>
            </example>
            <example>
              <xml>
                <i><b>reposer</b> sa vue, ses yeux sur un objet : les y arrêter avec plaisir, avec complaisance.</i>
              </xml>
              <txt>reposer sa vue, ses yeux sur un objet : les y arrêter avec plaisir, avec complaisance.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="transitif"/>
                <label type="sem" value="figuré"/>
              </labels>
              <xml>Procurer du <innerLink ref="calme">calme</innerLink>.</xml>
              <txt>Procurer du calme.</txt>
            </gloss>
            <example>
              <xml>
                <i><b>reposer</b> la tête, <b>reposer</b> l'esprit, <b>reposer</b> l'âme.</i>
              </xml>
              <txt>reposer la tête, reposer l'esprit, reposer l'âme.</txt>
            </example>
            <example>
              <xml>
                <i>La verdure <b>repose</b> la vue.</i>
              </xml>
              <txt>La verdure repose la vue.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="intransitif"/>
              </labels>
              <xml>Être <innerLink ref="établi">établi</innerLink>, <innerLink ref="appuyer">appuyé</innerLink>, <innerLink ref="fonder">fondé</innerLink>.</xml>
              <txt>Être établi, appuyé, fondé.</txt>
            </gloss>
            <example>
              <xml>
                <i>L'intégrité journalistique <b>repose</b> largement sur l'absence de conflits de loyautés, et même sur l'absence d'apparence de tels conflits.</i>
              </xml>
              <txt>L'intégrité journalistique repose largement sur l'absence de conflits de loyautés, et même sur l'absence d'apparence de tels conflits.</txt>
            </example>
            <example>
              <xml>
                <i>La base de l'édifice <b>repose</b> sur le roc, sur des pilotis.</i>
              </xml>
              <txt>La base de l'édifice repose sur le roc, sur des pilotis.</txt>
            </example>
            <example>
              <xml>
                <i>Son crédit, son autorité ne <b>repose</b> que sur de faibles bases.</i>
              </xml>
              <txt>Son crédit, son autorité ne repose que sur de faibles bases.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="intransitif"/>
              </labels>
              <xml>Être en <innerLink ref="état">état</innerLink> de <innerLink ref="repos">repos</innerLink>, de <innerLink ref="tranquillité">tranquillité</innerLink>.</xml>
              <txt>Être en état de repos, de tranquillité.</txt>
            </gloss>
            <example>
              <xml>
                <i>Il ne dort pas, il <b>repose</b>.</i>
              </xml>
              <txt>Il ne dort pas, il repose.</txt>
            </example>
            <example>
              <xml>
                <i>Laisser <b>reposer</b> ses esprits.</i>
              </xml>
              <txt>Laisser reposer ses esprits.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="intransitif"/>
              </labels>
              <xml><innerLink ref="dormir">Dormir</innerLink>.</xml>
              <txt>Dormir.</txt>
            </gloss>
            <example>
              <xml>
                <i>Il n'a pas <b>reposé</b> de toute la nuit.</i>
              </xml>
              <txt>Il n'a pas reposé de toute la nuit.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="intransitif"/>
              </labels>
              <xml><innerLink ref="déposer">Être déposé</innerLink>, <innerLink ref="placer">être placé</innerLink> en quelque <innerLink ref="endroit">endroit</innerLink>.</xml>
              <txt>Être déposé, être placé en quelque endroit.</txt>
            </gloss>
            <example>
              <xml><i>Sur le bord du fleuve, […], il rencontra un autre aéroplane qui lui parut à peine endommagé. […]. Il <b>reposait</b> là, abandonné, et l'eau clapotait sur l'extrémité de sa longue queue.</i> }}</xml>
              <txt>Sur le bord du fleuve, […], il rencontra un autre aéroplane qui lui parut à peine endommagé. […]. Il reposait là, abandonné, et l'eau clapotait sur l'extrémité de sa longue queue. }}</txt>
            </example>
            <example>
              <xml>
                <i>Le Saint Sacrement <b>repose</b> dans cette chapelle, dans ce tabernacle. - C'est dans cette église que <b>reposent</b> les reliques de tel saint.</i>
              </xml>
              <txt>Le Saint Sacrement repose dans cette chapelle, dans ce tabernacle. - C'est dans cette église que reposent les reliques de tel saint.</txt>
            </example>
            <example>
              <xml>
                <i>Voici la tombe où il <b>repose</b>, la pierre sous laquelle il <b>repose</b>.</i>
              </xml>
              <txt>Voici la tombe où il repose, la pierre sous laquelle il repose.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="intransitif"/>
              </labels>
              <xml><innerLink ref="tenir">Tenir</innerLink> un <innerLink ref="liquide">liquide</innerLink> <innerLink ref="immobile">immobile</innerLink> <innerLink ref="afin">afin</innerLink> qu'ils se <innerLink ref="clarifier">clarifie</innerLink>.</xml>
              <txt>Tenir un liquide immobile afin qu'ils se clarifie.</txt>
            </gloss>
            <example>
              <xml>
                <i>Cette eau est trouble, il faut qu'elle <b>repose</b> quelque temps.</i>
              </xml>
              <txt>Cette eau est trouble, il faut qu'elle repose quelque temps.</txt>
            </example>
            <example>
              <xml>
                <i>Il faut laisser <b>reposer</b> le vin qui a voyagé.</i>
              </xml>
              <txt>Il faut laisser reposer le vin qui a voyagé.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="intransitif"/>
                <label type="sem" value="figuré"/>
              </labels>
              <xml>Pour une <innerLink ref="terre">terre</innerLink>, laisser en <innerLink ref="guéret">guéret</innerLink>, en <innerLink ref="jachère">jachère</innerLink>, sans l'<innerLink ref="ensemencer">ensemencer</innerLink>.</xml>
              <txt>Pour une terre, laisser en guéret, en jachère, sans l'ensemencer.</txt>
            </gloss>
            <example>
              <xml>
                <i>Laisser <b>reposer</b> une terre labourable.</i>
              </xml>
              <txt>Laisser reposer une terre labourable.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="intransitif"/>
                <label type="sem" value="figuré"/>
              </labels>
              <xml>Pour un <innerLink ref="ouvrage">ouvrage</innerLink>, le garder pendant un certain temps, sans le <innerLink ref="relire">relire</innerLink>, sans le montrer, sans le rendre public, afin de le revoir ensuite à loisir et de sang-froid.</xml>
              <txt>Pour un ouvrage, le garder pendant un certain temps, sans le relire, sans le montrer, sans le rendre public, afin de le revoir ensuite à loisir et de sang-froid.</txt>
            </gloss>
            <example>
              <xml>
                <i>Laisser <b>reposer</b> un ouvrage.</i>
              </xml>
              <txt>Laisser reposer un ouvrage.</txt>
            </example>
          </definition>
          <definition>
            <gloss>
              <labels>
                <label type="gram" value="pronominal"/>
              </labels>
              <xml><innerLink ref="cesser">Cesser</innerLink> de <innerLink ref="travailler">travailler</innerLink>, d'<innerLink ref="agir">agir</innerLink>, d'être en <innerLink ref="mouvement">mouvement</innerLink>, pour faire <innerLink ref="disparaître">disparaître</innerLink> la <innerLink ref="fatigue">fatigue</innerLink>.</xml>
              <txt>Cesser de travailler, d'agir, d'être en mouvement, pour faire disparaître la fatigue.</txt>
            </gloss>

[sqlite tutorial](https://www.sqlitetutorial.net/)

[sqlite cli](https://sqlite.org/cli.html)

[sqlite in 5 min](https://www.sqlite.org/quickstart.html)

> At a shell or DOS prompt, enter: "sqlite3 test.db". This will create a new database named "test.db". (You can use a different name if you like.)

[Baeldung - Parsing an XML File Using SAX Parser](https://www.baeldung.com/java-sax-parser)

[differences between DOM, SAX and StAX XML parsers?](https://stackoverflow.com/questions/21019509/what-are-the-differences-between-dom-sax-and-stax-xml-parsers)

[Reading a big XML file using stax and dom](https://stackoverflow.com/questions/9379868/reading-a-big-xml-file-using-stax-and-dom) very useful! [Stream XML node by node](https://stackoverflow.com/questions/36617013/stream-xml-node-by-node). [XMLEventReader has peek]( https://docs.oracle.com/en/java/javase/14/docs/api/java.xml/javax/xml/stream/XMLEventReader.html ). [What is the difference between XMLStreamReader and XMLEventReader?](https://stackoverflow.com/questions/36717402/what-is-the-difference-between-xmlstreamreader-and-xmleventreader). [How to read modify fragments of XML using StAX in Java?
](https://stackoverflow.com/questions/41803078/how-to-read-modify-fragments-of-xml-using-stax-in-java).

> My XML files don't have a certain structure - so I cannot use JaxB. 

> I think I need a library that reads an XML file using stream - but parse each entry using DOM. Is there such a thing?

> trouble:
> Caused by: java.lang.IllegalStateException: StAXSource(XMLEventReader) with XMLEventReader not in XMLStreamConstants.START_DOCUMENT or XMLStreamConstants.START_ELEMENT state

Observations:

- DOMResult must be created with a root element, like this:

    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    Document doc = docBuilder.newDocument();
    Element rootElement = doc.createElement("wat");
    final DOMResult result = new DOMResult(rootElement);

  Otherwise is does strange things like picking the name of the first node encountered as the root node.

- The "cursor" in the stream of events must have already passed the opening
  tag. For the parsing to work. It keeps parsing until encounters eof, or an
  unmatched closing tag. (I found this by experiment, I havent found any piece
  of documentation that explains it.

- That means that for parsing consecutive elements, me might need to advance
  the cursor over the opening tags each sigle time.

[javadocs for module java.xml](https://docs.oracle.com/en/java/javase/14/docs/api/java.xml/module-summary.html)

[Spring: overriding one application.property from command line](https://stackoverflow.com/questions/37052857/spring-overriding-one-application-property-from-command-line)

[Sqlite CREATE TABLE](https://sqlite.org/lang_createtable.html)

> Each table in SQLite may have at most one PRIMARY KEY. If the keywords PRIMARY KEY are added to a column definition, then the primary key for the table consists of that single column. Or, if a PRIMARY KEY clause is specified as a table-constraint, then the primary key of the table consists of the list of columns specified as part of the PRIMARY KEY clause. The PRIMARY KEY clause must contain only column names — the use of expressions in an indexed-column of a PRIMARY KEY is not supported. An error is raised if more than one PRIMARY KEY clause appears in a CREATE TABLE statement. The PRIMARY KEY is optional for ordinary tables but is required for WITHOUT ROWID tables.

> The data for rowid tables is stored as a B-Tree structure containing one entry for each table row, using the rowid value as the key. This means that retrieving or sorting records by rowid is fast. Searching for a record with a specific rowid, or for all records with rowids within a specified range is around twice as fast as a similar search made by specifying any other PRIMARY KEY or indexed value.

[Is an index needed for a primary key in SQLite?](https://stackoverflow.com/questions/3379292/is-an-index-needed-for-a-primary-key-in-sqlite)

[sqlite autoincrement](https://www.sqlite.org/autoinc.html)

> On an INSERT, if the ROWID or INTEGER PRIMARY KEY column is not explicitly given a value, then it will be filled automatically with an unused integer, usually one more than the largest ROWID currently in use. This is true regardless of whether or not the AUTOINCREMENT keyword is used.

> If the AUTOINCREMENT keyword appears after INTEGER PRIMARY KEY, that changes the automatic ROWID assignment algorithm to prevent the reuse of ROWIDs over the lifetime of the database. In other words, the purpose of AUTOINCREMENT is to prevent the reuse of ROWIDs from previously deleted rows.

[sqlite types](https://www.sqlite.org/datatype3.html)

[spring boot sqlite](https://www.baeldung.com/spring-boot-sqlite)

[What is the purpose of mvnw and mvnw.cmd files?](https://stackoverflow.com/questions/38723833/what-is-the-purpose-of-mvnw-and-mvnw-cmd-files)

[Are multiple .gitignores frowned on?](https://stackoverflow.com/questions/3305869/are-multiple-gitignores-frowned-on)

> Please remember that patterns in .gitignore file apply recursively to the (sub)directory the file is in and all its subdirectories, unless pattern contains '/' (so e.g. pattern name applies to any file named name in given directory and all its subdirectories, while /name applies to file with this name only in given directory).

[spring boot command line arguments](https://www.baeldung.com/spring-boot-command-line-arguments)

> mvn spring-boot:run -D"spring-boot.run.arguments"="foo.txt"

[buffered reader](http://tutorials.jenkov.com/java-io/bufferedreader.html)

[How to implement a Java stream?](https://stackoverflow.com/questions/30685623/how-to-implement-a-java-stream). [Stream from Iterable](https://www.baeldung.com/java-iterable-to-stream). [Stream package](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/stream/package-summary.html). [Stream javadoc](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/stream/Stream.html#iterate(T,java.util.function.UnaryOperator)). [StreamSupport javadoc](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/stream/StreamSupport.html).

[XMLStreamReader](https://docs.oracle.com/en/java/javase/14/docs/api/java.xml/javax/xml/stream/XMLStreamReader.html).

[StaX parsing: Transformer.transform method moves cursor automatically, not always nice](https://stackoverflow.com/questions/24350740/stax-parsing-transformer-transform-method-moves-cursor-automatically-not-alway)

[How to pretty print XML from Java?](https://stackoverflow.com/questions/139076/how-to-pretty-print-xml-from-java)

[Should Iterator.hasNext be side effect free?](https://stackoverflow.com/questions/13291258/should-iterator-hasnext-be-side-effect-free)

> It would be OK for hasNext to have side effects as long as they are not perceptible from the outside. Above all, it must be idempotent. 

[Oracle Stax tutorial](https://docs.oracle.com/javase/tutorial/jaxp/stax/index.html)

[Java switch expressions.](https://openjdk.java.net/jeps/361)


> The cases of a switch expression must be exhaustive; for all possible values there must be a matching switch label. (Obviously switch statements are not required to be exhaustive.)

> In practice this normally means that a default clause is required; however, in the case of an enum switch expression that covers all known constants, a default clause is inserted by the compiler to indicate that the enum definition has changed between compile-time and runtime. Relying on this implicit default clause insertion makes for more robust code; now when code is recompiled, the compiler checks that all cases are explicitly handled. Had the developer inserted an explicit default clause (as is the case today) a possible error will have been hidden.

[adopt node vs. import node (Java XML)](https://docs.oracle.com/javase/7/docs/api/org/w3c/dom/Document.html#adoptNode(org.w3c.dom.Node))

## run instructions

To run the importer:

     mvn package ;  mvn spring-boot:run -D"spring-boot.run.arguments"="example.xml"

