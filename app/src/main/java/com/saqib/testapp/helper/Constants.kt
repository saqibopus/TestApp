package com.saqib.testapp.helper

object Constants {
    object ENDPOINTS {
        const val BASE_URL = "https://dl.dropboxusercontent.com/"
        const val FACTS_LIST = "s/2iodh4vg0eortkl/facts.json"
    }
    object ErrorCodes{
        const val OK200 = 200
        const val ERROR401 = 401
    }
    object ErrorMessage{
        const val COMMON_UN_IDENTIFIED = "Oops..Something went wrong"
        const val NO_DESC_AVAILABLE = "No description available"
        const val NO_TITLE_AVAILABLE = "No title available"
    }

    object Mock{
        const val MockString = "{\n" +
                "\"title\":\"About Canada\",\n" +
                "\"rows\":[\n" +
                "\t{\n" +
                "\t\"title\":\"Beavers\",\n" +
                "\t\"description\":\"Beavers are second only to humans in their ability to manipulate and change their environment. They can measure up to 1.3 metres long. A group of beavers is called a colony\",\n" +
                "\t\"imageHref\":\"http://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/American_Beaver.jpg/220px-American_Beaver.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Flag\",\n" +
                "\t\"description\":null,\n" +
                "\t\"imageHref\":\"http://images.findicons.com/files/icons/662/world_flag/128/flag_of_canada.png\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Transportation\",\n" +
                "\t\"description\":\"It is a well known fact that polar bears are the main mode of transportation in Canada. They consume far less gas and have the added benefit of being difficult to steal.\",\n" +
                "\t\"imageHref\":\"http://1.bp.blogspot.com/_VZVOmYVm68Q/SMkzZzkGXKI/AAAAAAAAADQ/U89miaCkcyo/s400/the_golden_compass_still.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Hockey Night in Canada\",\n" +
                "\t\"description\":\"These Saturday night CBC broadcasts originally aired on radio in 1931. In 1952 they debuted on television and continue to unite (and divide) the nation each week.\",\n" +
                "\t\"imageHref\":\"http://fyimusic.ca/wp-content/uploads/2008/06/hockey-night-in-canada.thumbnail.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Eh\",\n" +
                "\t\"description\":\"A chiefly Canadian interrogative utterance, usually expressing surprise or doubt or seeking confirmation.\",\n" +
                "\t\"imageHref\":null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Housing\",\n" +
                "\t\"description\":\"Warmer than you might think.\",\n" +
                "\t\"imageHref\":\"http://icons.iconarchive.com/icons/iconshock/alaska/256/Igloo-icon.png\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Public Shame\",\n" +
                "\t\"description\":\" Sadly it's true.\",\n" +
                "\t\"imageHref\":\"http://static.guim.co.uk/sys-images/Music/Pix/site_furniture/2007/04/19/avril_lavigne.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":null,\n" +
                "\t\"description\":null,\n" +
                "\t\"imageHref\":null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Space Program\",\n" +
                "\t\"description\":\"Canada hopes to soon launch a man to the moon.\",\n" +
                "\t\"imageHref\":\"http://files.turbosquid.com/Preview/Content_2009_07_14__10_25_15/trebucheta.jpgdf3f3bf4-935d-40ff-84b2-6ce718a327a9Larger.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Meese\",\n" +
                "\t\"description\":\"A moose is a common sight in Canada. Tall and majestic, they represent many of the values which Canadians imagine that they possess. They grow up to 2.7 metres long and can weigh over 700 kg. They swim at 10 km/h. Moose antlers weigh roughly 20 kg. The plural of moose is actually 'meese', despite what most dictionaries, encyclopedias, and experts will tell you.\",\n" +
                "\t\"imageHref\":\"http://caroldeckerwildlifeartstudio.net/wp-content/uploads/2011/04/IMG_2418%20majestic%20moose%201%20copy%20(Small)-96x96.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Geography\",\n" +
                "\t\"description\":\"It's really big.\",\n" +
                "\t\"imageHref\":null\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Kittens...\",\n" +
                "\t\"description\":\"??are illegal. Cats are fine.\",\n" +
                "\t\"imageHref\":\"http://www.donegalhimalayans.com/images/That%20fish%20was%20this%20big.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Mounties\",\n" +
                "\t\"description\":\"They are the law. They are also Canada's foreign espionage service. Subtle.\",\n" +
                "\t\"imageHref\":\"http://3.bp.blogspot.com/__mokxbTmuJM/RnWuJ6cE9cI/AAAAAAAAATw/6z3m3w9JDiU/s400/019843_31.jpg\"\n" +
                "\t},\n" +
                "\t{\n" +
                "\t\"title\":\"Language\",\n" +
                "\t\"description\":\"Nous parlons tous les langues importants.\",\n" +
                "\t\"imageHref\":null\n" +
                "\t}\n" +
                "]\n" +
                "}"
    }
}