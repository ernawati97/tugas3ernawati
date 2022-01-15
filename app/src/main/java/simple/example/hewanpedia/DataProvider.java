package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Merak;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Katak;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Katak> initDataKatak(Context ctx) {
        List<Katak> kataks = new ArrayList<>();
        kataks.add(new Katak("amazon milk frog", "Brazil",
                "katak ini menjadi katak pohon yang terdapat di hutan amazon, dengan warna kulit yang sangat unik dan cantik. perutnya yang buncit dan warna kulit yang cerah dengan corak yang cantik.", R.drawable.amazon_milk_frog));
        kataks.add(new Katak("strowberry paison dart frog", "Amerika",
                "katak ini tergolong sebagai salah satu katak dengan warna yang indah tetapi katak ini memiliki racun yang mematikan dalam kulitnya.", R.drawable.strowberry_paison_dart_frog));
        kataks.add(new Katak("clown tree  frog", "Brazil",
                "katak ini memilik ke unikkan dengan corak warna yang sangat indah perpaduan corak orenge dengan warna kuning cantik.", R.drawable.clown_tree_frog));
        kataks.add(new Katak("read ayes tree frog", "Maksiko",
                "katak ini menjadi salah satu katak pohon unik dengan mata berwarna merah.", R.drawable.read_ayes_tree_frog));
        kataks.add(new Katak("ranitomeya amazonika", "Brazil",
                "katak ini merupakan salah satu jenis katak yang berwarna cerah dengan corak cantik perpaduan antara biru, hitam, dan kuning.", R.drawable.ranitomeya_amazonika));
        return kataks;
    }

    private static List<Merak> initDataMerak(Context ctx) {
        List<Merak> meraks = new ArrayList<>();
        meraks.add(new Merak("kongo", "afrika",
                "Merak kongo adalah salah satu burung dari tiga spesies merak. Spesies ini merupakan satu-satunya burung di marga Afropavo dan merak yang terdapat di Afrika.", R.drawable.merak_kongo));
        meraks.add(new Merak("biru", "india",
                "Merak biru atau Merak india, yang dalam nama ilmiahnya Pavo cristatus adalah salah satu burung dari tiga spesies burung merak.", R.drawable.merak_biru));
        meraks.add(new Merak("hijau", "india",
                "Merak hijau adalah salah satu burung dari tiga spesies merak. Seperti burung-burung lainnya yang ditemukan di suku Phasianidae, merak hijau mempunyai bulu yang indah", R.drawable.merak_hijau));
        meraks.add(new Merak("putih", "india",
                "Burung ini dibilang langka karena warnanya yang sangat aneh dan unik karena tidak ada campuran warna seperti jenis burung lainnya. Burung merak putih juga dapat disebut burung merak jenis india. ", R.drawable.merak_putih));
        return meraks;
    }
    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci("netherland_dwarf", "belanda",
                "kelinci yang berasal dari belanda dengan berat 1,1-2,5 pon,Dwarf belanda adalah satu ras kelinci terkecil ", R.drawable.kelinci_netherland_dwarf));
        kelincis.add(new Kelinci("orictolagus_cuniculus", "eropa",
                "kelinci orictolagus cuniculus juga disebut kelinci eropa atau kelinci domestik adalah satu satunya spesies dalam genusnya", R.drawable.kelinci_orictolagus_cuniculus));
        kelincis.add(new Kelinci("holland_lop", "belanda",
                "kelinci jenis holland lop adalah kelinci yang independent dan playfull", R.drawable.kelinci_holland_lop));
        kelincis.add(new Kelinci("mini_lop", "jerman",
                "Adalah jenis kelinci domestik yang di akui oleh american rabbit association ", R.drawable.kelinci_mini_lop));
        kelincis.add(new Kelinci("raksasa", "belgia",
                "jenis kelinci domestik yang sangat besar,biasanya dianggap sebagai jenis terbesar dari spesiesnya ", R.drawable.kelinci_raksasa));
        kelincis.add(new Kelinci("rex", "prancis",
                "kelinci ini mempunyai tubuh yang besar,telinga yang tegak,dan ciri khas yang menjadikan kelinci rex ini di sukai adalah bulunya yang seperti karpet ", R.drawable.kelinci_rex));
        return kelincis;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKatak(ctx));
        hewans.addAll(initDataMerak(ctx));
        hewans.addAll(initDataKelinci(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
