package com.gai.aleksej_gudkov.data;


import com.gai.aleksej_gudkov.R;

import java.util.ArrayList;


public class DataSet {
    private static String[][] sDataSet = {
            {"0", "CE-1257218",
                    "В роботі", "Комунальне господарство",
                    "вул. Вадима Гетьмана,42",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"1", "CE-1257219",
                    "В роботі", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,43",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"2", "CE-1257220",
                    "В роботі", "Екологія та природні ресурси",
                    "вул. Вадима Гетьмана,44",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"3", "CE-1257218",
                    "В роботі", "Комунальне господарство",
                    "вул. Вадима Гетьмана,45",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"4", "CE-1257218",
                    "В роботі", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,46",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"5", "CE-1257218",
                    "В роботі", "Екологія та природні ресурси",
                    "вул. Вадима Гетьмана,47",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"6", "CE-1257218",
                    "В роботі", "Комунальне господарство", "вул. Вадима Гетьмана,48", "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016", "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl",
                    "https://goo.gl/OVtrxC",
                    "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"7", "CE-1257218",
                    "В роботі", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,49",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"8", "CE-1257218",
                    "В роботі", "Екологія та природні ресурси",
                    "вул. Вадима Гетьмана,50",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},
            {"9", "CE-1257218",
                    "В роботі", "Комунальне господарство",
                    "вул. Вадима Гетьмана,51",
                    "Квіт. 13,2016", "9 днів", "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення в роботі"},

            {"10", "CE-1257218",
                    "Виконано", "Комунальне господарство",
                    "вул. Вадима Гетьмана,52", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"11", "CE-1257218",
                    "Виконано", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,53", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"12", "CE-1257218",
                    "Виконано", "Екологія та природні ресурси",
                    "вул. Вадима Гетьмана,54", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"13", "CE-1257218",
                    "Виконано", "Комунальне господарство",
                    "вул. Вадима Гетьмана,55", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"14", "CE-1257218",
                    "Виконано", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,56", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"15", "CE-1257218",
                    "Виконано", "Екологія та природні ресурси",
                    "вул. Вадима Гетьмана,57", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"16", "CE-1257218",
                    "Виконано", "Комунальне господарство",
                    "вул. Вадима Гетьмана,58", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"17", "CE-1257218",
                    "Виконано", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,59", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"18", "CE-1257218",
                    "Виконано", "Екологія та природні ресурси",
                    "вул. Вадима Гетьмана,60", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},
            {"19", "CE-1257218",
                    "Виконано", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,61", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення виконано"},


            {"20", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,62", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"21", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,63", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"22", "CE-1257218",
                    "Очікує", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,64", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"23", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,65", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"24", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,66", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"25", "CE-1257218",
                    "Очікує", "Скарги на \"гарячу лінію\"",
                    "вул. Вадима Гетьмана,67", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"26", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,68", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"27", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,69", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"28", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,70", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", "14 квітня 2016", "27 квітня 2016",
                    "Дніпропетровський МВК()",
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    "Це звернення очікує"},
            {"29", "CE-1257218",
                    "Очікує", "Комунальне господарство",
                    "вул. Вадима Гетьмана,71", "Квіт. 13,2016", null, "50",
                    "13 квітня 2016", null, null,
                    null,
                    "http://goo.gl/hjffDl", "https://goo.gl/OVtrxC", "http://goo.gl/cuL3i4",
                    null}
    };

    public static final String INPROGRESS_STATUS = "В роботі";
    public static final String EXECUTED_STATUS = "Виконано";
    public static final String WAITING_STATUS = "Очікує";
    private static String sUtilitiesType = "Комунальне господарство";
    private static String sHotlineType = "Скарги на \"гарячу лінію\"";
    private static String sEcologyType = "Екологія та природні ресурси";
    private static int sIcLikeId = R.drawable.ic_like;
    private static int sIcUtilitiesId = R.drawable.ic_public_service;
    private static int sIcHotlineId = R.drawable.ic_complaints;
    private static int sIcEcologyId = R.drawable.ic_ecology;
    private static int sIcDefoultId = R.drawable.ic_default_type;

    public static ArrayList<TaskCardCreator> getCard(String status) {
        ArrayList<TaskCardCreator> mOutputCard = new ArrayList<>();
        String likeCount;
        String targetCompanyType;
        String accidentAddress;
        String regDate;
        String daysRest;
        int likeId;
        int symbolId;
        long itemId;

        for (int i = 0; i < sDataSet.length; i++) {
            if (sDataSet[i][2].equalsIgnoreCase(status)) {
                likeCount = sDataSet[i][7];
                targetCompanyType = sDataSet[i][3];
                accidentAddress = sDataSet[i][4];
                regDate = sDataSet[i][5];
                daysRest = sDataSet[i][6];
                likeId = sIcLikeId;
                symbolId = getSimbolId(sDataSet[i][3]);
                itemId = Long.parseLong(sDataSet[i][0]);
                mOutputCard.add(new TaskCardCreator(
                        likeCount, targetCompanyType, accidentAddress, regDate, daysRest, likeId, symbolId, itemId));
            }
        }
        return mOutputCard;
    }

    private static int getSimbolId(String companyType) {
        int outputId;

        if (companyType.equalsIgnoreCase(sUtilitiesType)) {
            outputId = sIcUtilitiesId;
        } else if (companyType.equalsIgnoreCase(sHotlineType)) {
            outputId = sIcHotlineId;
        } else if (companyType.equalsIgnoreCase(sEcologyType)) {
            outputId = sIcEcologyId;
        } else {
            outputId = sIcDefoultId;
        }
        return outputId;
    }

    public static String getTitle(long cardId) {
        return sDataSet[findItem(cardId)][1];
    }

    public static String[] getRef(long cardId) {
        String[] output = new String[3];
        output[0] = sDataSet[findItem(cardId)][12];
        output[1] = sDataSet[findItem(cardId)][13];
        output[2] = sDataSet[findItem(cardId)][14];
        return output;
    }

    public static String getDateStart(long cardId) {
        return sDataSet[findItem(cardId)][8];
    }

    public static String getDateReg(long cardId) {
        return sDataSet[findItem(cardId)][9];
    }

    public static String getDateEnd(long cardId) {
        return sDataSet[findItem(cardId)][10];
    }

    public static String getStatus(long cardId) {
        return sDataSet[findItem(cardId)][2];
    }

    public static String getResp(long cardId) {
        return sDataSet[findItem(cardId)][11];
    }

    public static String getDes(long cardId) {
        return sDataSet[findItem(cardId)][15];
    }

    public static String getIndex(long cardId) {
        return sDataSet[findItem(cardId)][3];
    }

    private static int findItem(long cardId) {
        int cardPos = 0;
        for (int i = 0; i < sDataSet.length; i++) {
            if (Long.parseLong(sDataSet[i][0]) == cardId) {
                cardPos = i;
            }
        }
        return cardPos;
    }
}



