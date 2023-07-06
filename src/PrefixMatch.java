public class PrefixMatch {
    public static void main(String[] args) {
        int n=386;
        String arr[]= {"sv", "kfdzhbedmtfyckzdkllyqfwzyi","rplcnjeiuonfijtjgnifeajvc","nwcleudhpiphkwtizxisygcsyckgqovntnanyn",
                "cvctwlipsupidvwkpyrlmnxitkcrbsaxhrxetkqxsu","rhrtcvlnodgcokjyrylxbqxjudjzjtmfxerkyqujylmq",
                "rgrxtdkcbrasyogrrxlpsbjomhkiarikgssruujtvm","jihkgvnkgmr","yxpbarlifyhrtbhfdwjqaahbmnmgbkwsufbj",
                "exehffynzjbpxurhnhhkojghw","uyfufxfziwgjsnzqslnyfrmzuvkkyaxenrtxiq","qikcjetwetizw","xbjr",
                "ukptuvbtwxwtuzkvittf","wtgnqsqosopujikwfgamqioqumfclfnlazimdpnvhzpdzseij","nrkxpcufcupouqgkqoltelshneohfizvnpjhvs",
                "pzhvffqmbxxriozqbpmalambmzsvnlwijfvnhvmedagdv","culjconcznhnajmwwsdlldxxlpkccjreiupqnqfdjeatmefkp",
                "a","ikdttwsdmditihqerhzcxsd","lokmqmhf","nkocdgberocsrcwd","hzxcyhlwbbdpzvimpqkzreddsjaqkzucapmfjnxpva",
                "rmwcpsaoeyydopgwsulunyofvwqbbnrlvusdmshquslbppyrt","lumjosohmszcjlbieh","qvdnumxkazvcpqrgqqciupe",
                "kapduvnrzjobwxnsbzttzjlgrhgmipboki","mjgsptwlxlzumexjfjm","couatmmdrke","cwoeqtwlcmtflxvygrhbqsfmclqurlvvchiyabq",
                "xcxwvkgdzhtbfkqabrpgvoymra","igjcyvznkyaquest","lqlnrdwlgaanmueqqnavouuhjisfqhoasijuvyypcfpotf",
                "esw","atrdcwljmsbctdui","hdbucunnwejhpzehhes","bzrfzmwwawrnrzcypjoiiveafnuzhnfstkqhmtrrxdrhwjhu",
                "kjhedvouprtyrby","qkyu","j","fbdhjcizibtienwajmapzcbexkkbwhgzyyl","fiyoaxnqiqyyivcrlzhewtabimfknz",
                "eoxrijbivn","txhqmjaeaagaicshwmgokehysrgmqukph","dfegiiffyjyoqgdwzzshygeibmcov","lgherfmducxxhhqnqjufybvzshfqoktrapdjhkxiw",
                "ppojhbwiedslzlfcterccqngzkvnkhddtwvytynrrkhmn","ogonjxswztjcxbaawf","lohiznbvqvhissstfwici",
                "lmjjtl","mjayhxprdbtwkjobzrkwtrqezlrzkfxbjezaoecc","pewosjmbrcouebgzwtsztxtqwejhfvqfqoexhxx",
                "imsdybkpudkoaqtzgiejcrzqcjmas","shyfarcpzdbizfwjsjzr","skvejtsmgunzfczzfvozwywvnkzhezqtnevhsreocsekfdohy",
                "taqonrojvbbddnkvtrvl","godihpnhozv","hmeqprsaklcpyjkdyhhkjelxenewttdumlnleqbxvyewtll",
                "lttanwvncbnopwmscwuibgldmuacbv","iceiylhvkceimkey","nzktjocbbbzux","vebienrkwogrdiaitaroehxtcnynhwpsri",
                "aoiyowioqstaegpjbeyotxvzdyvtopfxcbpqszthhqgr","mgjvr","tdkymfkrf","xitsgvejsgdwcscxeljhuo",
                "pzasgnnrvnhbrjgzyjmvjwbsxbtsnwilgnhbydtdlq","vyaxshmtstaihwvsjkmapiejimziogpcqsbvapmwozapnsaqxi",
                "ptm","rdkqydx","gddaxfvezuvdovdebhonhxsndirhvghrgqlxzt","eyidkagfr","gqgiazzijouwqzrzizryzmbjhdksluphb",
                "didhhrw","iotukajzhtmnphzysoygaa","vtvglanoirxupvqtsmgixduznaneqpnkpzddehlyl","brdhvequmzeleemfrphulhjyvtxgynmoccxdhsw",
                "piisslkdfikuybljcjfhecdibvrzjjpcbczkt","uvumzctlkfnzxpvueaebtqfwulf","xkawzkvnupmcfdhendtwpoeimbnwfckqjkivyl",
                "gdghlurdkywtrtnryzcedfgzinjqqxngyoddxgs","hsfctarpsbssjnpyfxxbthspqjyzzl","opskamivxvctmaobskpfbsz",
                "kpkxyqznohbspjuhlxikxvvciyjiglommhgp","fjevbehaeexjyhfbaaud","iaywzfbivsujnljilndogfoxefpflrdioxqcpikzbmfvbdxtkk",
                "dxqbuekghugckbqtp","comrod","lolsypdiqsakyszaw","tga","rxbenuwcqcrmyzosuksqzzexs","zzwtmwdjpexynhybsycursqq","uckirmjjfkzfdyygxzczfhezrpje","rsegmojwubhusdkjpnjo",
                "hzetngfsekozmwcakp","kdhfcfvqfvgeslpblexzzxtvuyjwyubsanrmvhoibpsbmrmkh","obvkkkbkmqsdyztxrzjemoarujcnngyglcoahgdyvtswaqhi","fjhdwtnzkdifyybaukkigvqdsxkmyngjbkgdueziukamphwhaf",
                "cgcclfvycapcswwpdhkynvotxndasyhwieca","noatxdidtewtglcihsl","awgoyetwcqmyavbjoiggzebxujozzdhwjwbax",
                "nuklvlvuewkrtpuoojdwearwkyol","qwtbgai","npykgtfcrrcttiupjkilyomcwkdvfqhnnlma","lzrzyv",
                "bgpsrgurhttqtqmkjwmnjbiybszbguowvpfpyeeruw","dy","ankmkxuucnjjxfruavxnobjvxqjdrebwdcthrh",
                "hjahpwjuz","gdklalfjdugkdjbbrhhvdkjqzzbozxw","sshyrfthpvteolracgutezyc","yyjlyellptvh",
                "nzfueodixhdwnfpgzibnzgzbkgcbyqgxzuqgirwchpvvl","dgbecnrgtnkqwfselagddgan","kmql",
                "xhpvwbxodrwmabvnghhawtzjmasyidybmkokjupunjxisdvq","qtlzndbpligmmwmjqxuslpi",
                "wxheauznpkpukjkogplfdufgovlvwwynohqhkpkqhyyvb","oyymkfoekc","ythqxzppgvhgwjqvzzovsapkj","qjiwbqweootcgldgwkxblfqfuzexhg",
                "sgeacaafosrehrlrlmhpipihghtszqgcnbkfkmfarflrrqq","qlwqtdlvraimysyipktpkpuiqhonh","gbdhlphac",
                "ifbfzckqywwfdafov","dacswmtbjdkkspbacncugqydmb",
                "aaynnavznkgbkzcahscawdfulurqxcjmk",
                "ld",
                "docggmkcleugbkzvzltfqvlezicgkulnvimmjzqstmzvffkdu",
                "zjiluvvngpybzcuaaglumylignymouswbgdurnqohk",
                "pofhlavdm",
                "wpjnchgmzyot",
                "iryluoucrrtlxg",
                "fqyypbbosey",
                "iivrvejukahbi",
                "vdqqsyeqww",
                "cbklzxwzhxljrww",
                "bcoxlomvoigjjkkyknxrhdmbheynkefpnlbcft",
                "bcebxsygkeprfutruszopdtnonjwnxeuuwgolm",
                "rtevhixuvcohwaxega",
                "sbbjyaibolgaquillpowmplnczbv",
                "eymnfmlnlfroajdiykyixpfzinkvvrsjiozztamws",
                "zpxluaaherzrrjz",
                "mrhuhxxjxfiftcmyhhpzuxjddaynkkoefwobzoscwldgxnkdl",
                "azppomvsanvjl",
                "sbllcatoenhfcifjcaedrdtwqtzplnxdowkq",
                "xqsnwiolwpqxxlvfvdqntrcqzuvnydycv",
                "kdtmrpdvmevgbwtnixaqxboeztchueypshaqihnwjlhrduk",
                "riicareueiuv",
                "zlnewglfsxcxfoouspyntkgcjycfxzgusvgtvelbykgeardobq",
                "dutxazifjqkznigesqawhftqvjqsozagthsqqdsebjauygsbn",
                "pofeedcxfrbnypdzrtqveegckqwfoaeqsjuluuufizosjqulj",
                "mmqosvcuahheopbtrtzgginknfzuygxemtnuensdpy",
                "uqhcwqpdedpkzygrymqnjcvj",
                "sqtgxjnoqwjejshpskmckefkydsypvh",
                "dmn",
                "kbgmqedyoycuxamlhuhetbcbke",
                "qpcnkxxvkztqoh",
                "dnxsxgpeynujxgkmhxxh",
                "bwfnqtxwtaeveatxvrjphohwbgxetzkd",
                "xmdvjquilyjymlbprmdftxwqdgusfeagmywepmblcjsc",
                "kwkagpvbzeydjuyvcdoayck",
                "cmgrjmwhpt",
                "nwdxp",
                "satltyovxotijualliaqbunwka",
                "bojttktvtkqqgacvdbr",
                "xmlihjtncpzgdfrtrbvetydyvi",
                "yicmetkmeaugmpgqfydocfcweoa",
                "dbnnmybbkkljbhyjpburezplznvxy",
                "ztiubyhdzehylprkwomvbjnewottzn",
                "szmalkgijgdjgawjyhvrknassvropgfhs",
                "nkf",
                "ifszzfmrfszmrwlfihxvjpenlsatibsxhanstfboq",
                "sfhipcykrtps",
                "pghwqtstykcptuzkoszyrecjaustwaerqnogckvw",
                "frmhykfeisfiqmneap",
                "przvshvnfnhz",
                "lgqjdtgvjkspsgkrpgfyvfnjxrzhdozsuuv",
                "sjuxwuneewjhppzv",
                "krdiogfbbsi",
                "wzruzddvdxfurxhitbpzhbvrgczoi",
                "aeobweflooydehdb",
                "zzqyaivgtvnpvneygubrklexcgncackmt",
                "bcucvvrkxukkegykdrdgfhrqitpvbkoourjr",
                "kxfhenaevzk",
                "bcwurupkictzhrpyoostkdcxyunwtwbyxv",
                "odqyvapuyjrcgwvvmwrrokdjllxfypiqjosduysmupte",
                "njiuaqocupedrxnlkohvrwvszcqixgpeo",
                "zgemtahokladtqxwszgzeixbaeiajdrxfaabuwqrzfan",
                "cuciaacufyqawfeq",
                "ijflznjdjtcpvrjsxste",
                "pzhnhmlfzgantuonpntjewopbsnrckznoxuefypiaahttksh",
                "iotdmyngklrihzqmiphuyumefswrahgnacwtyjndphxhh",
                "ykvtccgqpclwqcyhpahcupegsdyhzwb",
                "qcagppk",
                "srcukklsqrpsadxjonkonbw",
                "rcotzhgtqboasnsagawivpcswcylivqrz",
                "vrodbvhqpaubr",
                "dkyenxjgbn",
                "owubmomwysaeeqdsoxrfbdvppcnbconaytjzsorsdlpg",
                "rtafbdrls",
                "mddzskvgeppgrywzngeqgiudsgsu",
                "prxkfezvfrflqvde",
                "swijwygrqelfbliomptbgmdcnkgdwzeyleyggpxhpccdvr",
                "jzxbmfiehmdbylbhpqznrvreuianwanugjvaljlwjkdwbsp",
                "tuurnwmtsimjzcamqptklcfatwpjwxhrjxttkpzjb",
                "qgam",
                "dnihxiechgxooxwmqryem",
                "zdpzrgwkrjcgovyqaquubevzzkjhydzprxngs",
                "ancrbzajrouldogfmed",
                "txaqibdndctlulhzqt",
                "dqyqmxfgopkfpiw",
                "jp",
                "fwwqzwtk",
                "dhmadvfizevlfd",
                "vythcmmbcmjpjajeklyallvdmbkxswmcypevbzoetr",
                "gkkcjlvguhysubovfvchljaqguoiliazsoe",
                "fiizeiwmznzzsjzkokcxtcwwpruhwhwckgpeunkuaxcif",
                "qusdvxpwbtgskkcqelfrvlgezxnvecmoivewdkqkgct",
                "rjbpbhnu",
                "kxtbsmcsdvfkvgmk",
                "ieiuumgogfqxfdeatshyjrvewmwraedlkdlwang",
                "jyjfeznmbaszyqnoeoknvwlocalmyberrwuvtjbiwh",
                "dhhbvectbiuhuspkvzxrekwol",
                "mnkksovipibhhnonvwgscvzrjofpuqvdxaxtvxxrrznznat",
                "joubcrigavurrxkbksugbbmwvmtelshcqlny",
                "sflerougaobuqoephlzlskhgnaxeulgahrbijzwipkzdf",
                "bswkpefijkxk",
                "axqfmrmyalifjydslbyfxdcxptqzgv",
                "eybhhjzbqeqgrjyxawprfgosiubtztjkjlyhoavguac",
                "zjcdfa",
                "wasersuwbkvrotmyxwfcukosnoboemksfokzafjfidd",
                "dqsvjjsgznfbpkumwrarovv",
                "djglhqwkfltbcedrfvekcwafuv",
                "gjg",
                "ctvjnpmcydttpxbicykgzhgbdqfgnx",
                "wydfnwsxbjfqjxwiyamojjhexfqcsqbxhdbwceolpw",
                "eqezvvexcwymuquhrkteluupsxyjbnscywoieyyfoi",
                "ubhckrtqpl",
                "t",
                "zpkukbmxphafbtofg",
                "jcxskmpuwvdcyjbzjvztgnaqpivsmzezrfdaxrewegxqrmwa",
                "gstdhdximjzhelcusencjuomfebvbvps",
                "gqnqajozqzbdcj",
                "vbvncvgtmdtzrirnckvjpsqcvgoaqlaqibfnajbsxvbeobpt",
                "bliawehs",
                "ezcapgsadtqzie",
                "nlbjwyphjbaxplythkdrkytvlramppehibvplmscakugtmxfn",
                "iaoxcwcaevsgrontbwpgaotekmzwrk",
                "sztebg",
                "rwqwcnhufrzqctsepldagns",
                "kuy",
                "xfqtsamftlawtoyejwolvawpeoxdbl",
                "ehoxhuy",
                "ynfuittzgujcfbuxjlxcxnuszjjapyqo",
                "atwpepdbdordcmhlwoaxsqjexmmajsduhwhrqv",
                "sevrcbrcnsddc",
                "rzkwqxkbofnnmpadcpwcdbdfbovihs",
                "dkyoxygoeyunjexepazybmtdfkzzpj",
                "zkpcddlmm",
                "ueevriolcnmfglftgmkjatbgpmatzstaeeg",
                "leyztwtnkhhthvsfniivnftejuhnbnfamkmcuzdt",
                "nexwrpbfdmgyphxcdm",
                "ctxda",
                "mikkzsqlvecburjbdopxpiaglpdksemtqpznmviusxap",
                "vvnnfvbhquzamencnwyeigclrbxdfzcbpbiiqs",
                "ljouhvvfahsosxufhswgcajqpypblgpweslnitk",
                "pixdutjkzkto",
                "cipiixpniocqsrkhfvhhkyqiorujyizgjwsofsv",
                "xyrltlgpppcksczbeemnwslgsacrbkyirnokpsmw",
                "tuwygwerfqwlhflfnzqzhcbwereouwawtkwrmxubxke",
                "evgtrpxstovhbzoultwjheilepovoywggtdorhhhcmqy",
                "twbviwymqxqtowjdjuwxaujcozbttdhvgpkreyctsjigngmau",
                "yajtihijgfriulyonignilyw",
                "zjzpqkkspywx",
                "vkpxsqnrbdmpyfypcvgodgbpakxjhqahvhhhrfrtvktbn",
                "lvmbedeqnqowmkjxfskzqwtdqhpwmmvpptlfdpjulaafya",
                "fbdqohkeypabnzkqugavq",
                "bifjayzb",
                "nyjkkqqrknnlbpeylgladhbavjpwlmk",
                "mhqxpftuhqnjx",
                "n",
                "gwxcqcduudcmdctevukiafvdmur",
                "nipisgpeqozbzo",
                "yvxyfbpqgtqscfwhekbg",
                "htwipwomlhckboobjvxilffw",
                "qdcwxcitnixfrtvwywuuasajbbwcl",
                "bhsqojjtebnkssseazwiq",
                "stxhsaoooebskeyqnw",
                "xgzqvyjqipjjvewobhsslmtgdwfiieeohekvm",
                "oooatwdmguotxtztovxqzztiqvrnerkmufqsyqpma",
                "itgpujpimiewbmsbpekmxlljgqpfmpcvjieunw",
                "cykh",
                "xfyouhdp",
                "kpupyutnxykbafdnncwrtspuxxzloomd",
                "kxfnjfjqyevgwjbnrirhatxfyddwhhdlwyegkjilqagibwnx",
                "ucvaebgmzbubnlzmbzqbprihiy",
                "pndfwkewoorhwvjk",
                "cwfpseyqk",
                "jfwoqpozfyacxjlwkuahbvnhjfoyhyrvffvboafpckc",
                "ocn",
                "c",
                "ihpqtairkutzzrslfzliafvildjdyvtrcvrwfycidjdbwyxtj",
                "orffdfqbdyxiqzbeqamxnmnrvjtlym",
                "vcxaivqkrjotyrhfhvphmxo",
                "nhlrxlxxr",
                "dlzkajrfbnbeomgblvyjjzvnhyqzophulevsggnqwwlhpy",
                "wyvabmibyoyoiadmyhkl",
                "nvwwedvzyrpehtlwuvfvzwcz",
                "uzytdpczuaiiljnkmkithnzkumrdwsikyqwud",
                "oqmqmyxtislynnxjsuzjpytdrgg",
                "wlirlwzrqnlijbbbbllebrgpmdv",
                "ctkdpugqncrzkjufupsfmfeiaudbcdsfyazqwbdngcrdaf",
                "rwydkopycfckngrwiftdrbuqixqubak",
                "tosnphopkaqnyxdiiovgunumwrgghlabmfesoa",
                "afagxawzrabdoodmffopymicyzngdlwmedkrk",
                "xtxnbfwwsuzgfvjyiatdxfvekecvkbkjhtzjtoqjaszwkal",
                "asyqnnbxpjncmic",
                "hyvwyqhnpqypl",
                "zbayrateacphsfywqfaveeakmtefsshydfuk",
                "jehmz",
                "ovygcorjwppntjbawsapmgbinwccfhyovbnmkob",
                "xdvcqmbshtxskujoerltdqqchnuzbszcsfbhcfdeqylf",
                "vtlwyjdiwremksloraqifcvdufwiizw",
                "yvzuehyllaobhzzggosivmaeosptjyymxzismwytbpg",
                "dskuageniszauavieseagptntgnbfkjsadeyhbwxi",
                "njanvtoimaxlqn",
                "swmqrybrhtramknblftcpcdnymfhjzcppud",
                "hqezzjwouptp",
                "qjzvbatxddvqvrvbhgiqtrgqpmmiafeoioprdgvh",
                "jncxhqkwoevd",
                "vjexsdoyourbeupuxmg",
                "ttbaygvalqgfzphsamddnfc",
                "fgqqwkvurcjubiq",
                "lxoqcsfdtnohxxogepqigjkuzxpdnsxyrylofuyjdsobcijs",
                "qyzseilriwwkgyv",
                "skrxsgxiwysypewkba",
                "iw",
                "dqltyqkjsqghoyxaemgbbgtfvcfeyzzoconomgrmanriloo",
                "og",
                "zbamhfwkbgqwerhbpyldvzvbjrftopksrdfajsycokdtyh",
                "weuogwrvtkcapfixhfrruscvrletmcocihhvogtje",
                "ddoguaduaiednkoducaocczszjuhw",
                "ucdxtcioydnqkcugintifzjgquxmdmddobwzrokliyamci",
                "iuowzspijbpbbtfjptsnguppdfsrqonhhe",
                "xzqlcxvethjvjwldagpryuzychmisqhalvunvegpdidb",
                "vxiefurhjqo",
                "jvciqwwvehqfmkwwrzsxetxftrxeqk",
                "kokehiljnqgswsfqrevifmvkzbikgakhyfflnowkit",
                "xfseojaujtgbdaerojtxqxxjern",
                "yzffvabumupapenipmhbbddpujsowygt",
                "kvqiknfffchsgzahfkuhinpuapbtklmcbaneggntzecfxs",
                "yhvxttzcahzyqgyadgqjc",
                "gfaxcxmimodri",
                "zgqcccptussgxzpeyqtxzwbsecrdxfasp",
                "nvvwsjfoengmvxntoyvydzwedmmditicbjdbuzoumtguiawlpt",
                "x",
                "ranpridhotfdsfsymobssqukzsvgjyhfsbrqphbmbcqcsf",
                "zzwkphhvaiuagtk",
                "qoigjbopvonakunfsiaaxlaaynibhwb",
                "yvfwjrjakurfvpgurfztwfnhxceygtiznb",
                "ihkliogchjybb",
                "ppnqghyezanlciinwtgeku",
                "jaoondprrxwfzzcirumdpgpgugjccdopblrwk",
                "kbxjwpidclwihgcaxiqcd",
                "uuwsbxigiqxvxlnzxgsjjnsdrbgrhsozxgyseshcrhewopiwj",
                "ntrawoowxvhvzapfgmgjxryqbzlupsjhrzkuae",
                "iuspfahtqebbqbkzrbihtlhaqzncy",
                "ezunqsbmeqjfldmzjhsesprhhwmxizosmpmxfzozphxjlrbrhr",
                "qwilfykkwtbfnzuwssazpsbpuzuwfsdcrrwbpidm",
                "asi",
                "amdgjljzwlqppw",
                "ouecmchkoxzxprntyecdfbpwak",
                "vdflvwtqnejnsddrqxubfb",
                "dltwkzyhpukhf",
                "zibqjnfmvlzloxnfkcwewigbg",
                "sjckzynbwjrzqel",
                "wtuthhfqjvl",
                "ypqltjsqvmvztfoicfof",
                "smsevpjesmiywywjjnpoxgbntluymwevwrstnhbhwrcqmwbg",
                "gqcd",
                "jewvrjdphoxzhhfnwreqionyoqkrzzzfxcohombbxo",
                "xzrlalltaligkskzonovbcdiaqxccstaouh",
                "kyufuwxm",
                "ylmbiboipaoscbskioylobyl",
                "ihngwttllxavxmdxpqz"};
        String str = "axctsixkzvoxhu";
        int k=2;
        if(k>str.length()){
            System.out.println(0);
        }
        String comp=str.substring(0,k);
        System.out.println("comp: "+comp);
        int count=0;
        for(int i=0;i<n;i++){
            String lefcomp="";
            if(k>arr[i].length()) break;
            lefcomp=arr[i].substring(0,k);
            System.out.println(lefcomp);
            if(lefcomp.equals(comp)) count++;
        }
        System.out.print(count);
    }
}