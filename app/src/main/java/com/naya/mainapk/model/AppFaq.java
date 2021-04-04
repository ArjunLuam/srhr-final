package com.naya.mainapk.model;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.naya.mainapk.R;
import com.naya.mainapk.adapter.QuesAnsAdapter;

import java.util.ArrayList;
import java.util.List;

public class AppFaq extends Fragment {
    View rootView;
    //PDFView pdfView;
    RecyclerView recyclerView;
    QuesAnsAdapter quesAnsAdapter;
    List<QuesAns> quesAnsList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_app_faq, container, false);
        recyclerView = rootView.findViewById(R.id.rv_app_faq);
        quesAnsList = new ArrayList<>();

        quesAnsList.add(new QuesAns(getString(R.string.que1Faq), getString(R.string.ans1Faq)
                , "Q1"));
        quesAnsList.add(new QuesAns(getString(R.string.que2Faq), getString(R.string.ans2Faq), "Q2"));
        quesAnsList.add(new QuesAns(getString(R.string.que3Faq), getString(R.string.ans3Faq), "Q3"));
        quesAnsList.add(new QuesAns(getString(R.string.que4Faq), getString(R.string.ans4Faq), "Q4"));
        quesAnsList.add(new QuesAns(getString(R.string.que5Faq), getString(R.string.ans5Faq), "Q5"));
        quesAnsList.add(new QuesAns(getString(R.string.que6Faq), getString(R.string.ans6Faq), "Q6"));
        quesAnsList.add(new QuesAns(getString(R.string.que7Faq), getString(R.string.ans7Faq), "Q7"));
        quesAnsList.add(new QuesAns(getString(R.string.que8Faq), getString(R.string.ans8Faq), "Q8"));

        quesAnsList.add(new QuesAns(getString(R.string.que9Faq), getString(R.string.ans9Faq), "Q9"));
        quesAnsList.add(new QuesAns(getString(R.string.que10Faq), getString(R.string.ans10Faq), "Q10"));
       // quesAnsList.add(new QuesAns(getString(R.string.que11Faq), getString(R.string.ans11Faq), "Q11"));

        quesAnsList.add(new QuesAns(getString(R.string.que12Faq), getString(R.string.ans12Faq)
                , "Q10"));
        quesAnsList.add(new QuesAns(getString(R.string.que13Faq), getString(R.string.ans13Faq)
                , "Q11"));

        /*
        quesAnsList.add(new QuesAns("क्या मैं सिर्फ डॉक्टर के पास जाने के बजाय फार्मेसी से गर्भपात की गोली ले सकता हूं? \n " , " नहीं, डॉक्टर से बात करना बहुत महत्वपूर्ण है क्योंकि बिना देखरेख के गोलियां लेना जीवन के लिए खतरा पैदा कर सकता है। अपने चिकित्सक से बात करें, जो आपका मार्गदर्शन करेगा और आपको सर्वोत्तम संभव देखभाल देगा। इसके अलावा, फार्मासिस्ट के लिए आपको डॉक्टर के पर्चे के बिना गोलियां बेचना अवैध है\n","Q14"));
        quesAnsList.add(new QuesAns(" क्या यह सच है कि पीरियड के दर्द / ऐंठन के लिए दर्द निवारक दवा लेने से मुझे बांझ बना दिया जाएगा? \n" ,  " क्या यह सच है कि पीरियड के दर्द / ऐंठन के लिए पेनकिलर लेना मुझे बांझ कर देगा?\n","Q15"));
        quesAnsList.add(new QuesAns(" यौन अधिकार क्या है? \n" , " यौन संबंध बनाना यौन अधिकार नहीं है। एक यौन कार्य में सबसे महत्वपूर्ण कारक दोनों भागीदारों की इच्छा और सहमति है। यह एक ही सेक्स पार्टनर या पुरुष और महिला पार्टनर का सच हो सकता है। हमारा समाज विवाह को यौन संबंध बनाने के लिए एक लाइसेंस के रूप में देखता है और यौन संबंधों की अस्वीकृति करता है जो भागीदारों की आपसी और लंबी स्थायी या यादृच्छिक पसंद हो सकती है। आपको रिश्ते की प्रकृति के बारे में समझने और जानने की आवश्यकता है जो आकस्मिक हो सकता है या कीमत के लिए हो सकता है। \"सहमति\" के सवाल पर कोई समझौता नहीं है। नैतिक और नैतिक मूल्य आपके अपने हैं और आमतौर पर आपके धर्म और संस्कृति से प्रभावित होते हैं। महिला / लड़की को इस बात से अवगत होना चाहिए कि गर्भाधान (पुरुष के शुक्राणु अपने आप महिला के अंडे से जुड़ जाते हैं) सेक्स के बहुत पहले कार्य में हो सकते हैं, जो युवा महिलाओं में सबसे अधिक बार होता है, जो हर महीने अंडे के स्वस्थ और नियमित रूप से रिलीज होते हैं जो बंद हो जाएंगे मिनट गर्भाधान होता है। जिम्मेदारी का प्रश्न दोनों भागीदारों का होना चाहिए जो स्वेच्छा से एक बच्चे को याद रखना चाहते हैं कि पुरुष के पास कोई जिम्मेदारी नहीं है यदि कोई महिला आकस्मिक संबंध में गर्भवती हो जाती है। \n "+
                "                \"सेक्स करने का अधिकार के रूप में स्वतंत्रता: \n" +
                "                \"20 वीं सदी में महिलाओं के आंदोलन ने सेक्स करने के अधिकार के रूप में स्वतंत्रता की समझ में एक बड़ा बदलाव लाया, जो गैर-जिम्मेदाराना सेक्स की कीमत पर एक महिला की स्वतंत्रता का दावा करने का सबसे अच्छा तरीका नहीं है, जिसके परिणामस्वरूप गर्भावस्था हो सकती है और यौन संचारित रोग। \n " +
                "                \"किसी पुरुष या महिला के व्यक्तिगत अधिकार की अवधारणा, आनंद के लिए सेक्स करना, प्रजनन के लिए सेक्स से अलग है जैसा कि धर्म द्वारा निर्धारित किया गया है जो संयम का अभ्यास करने में परिलक्षित होता है। सेक्स एक जैविक आवश्यकता है और इसलिए हम इसे प्राकृतिक और यौन कह सकते हैं। इच्छा कुछ शर्म की बात नहीं है। हालांकि, यह पूरी तरह से उपभोग बन सकता है और अगर संतुष्टि से नहीं मिला तो जीवन में अन्य सभी जरूरतों से ध्यान भटक सकता है। \\ n \"+\n" +
                "                \"पुरुष और महिलाएं अलग-अलग यौन इच्छा का अनुभव करते हैं। हमें किशोरों और युवाओं की ज़रूरतों को समझना होगा जब हार्मोन सबसे अधिक मांग और रिलीज की मांग करते हैं। यौन इच्छा और आकर्षण अक्सर प्यार से भ्रमित होते हैं। इसलिए, प्यार में पड़ने की आवश्यकता जैविक से परे है।\" जब भावनाएँ शामिल होती हैं और हम कहते हैं कि \"लव ब्लाइंड है\"। \n " +
                "                \"प्रत्येक व्यक्तिगत अनुभव अद्वितीय है और हम प्यार को सही ठहराने के कारणों की तलाश नहीं करते हैं।\n","Q16"));

        quesAnsList.add(new QuesAns("एक महिला को क्या करना चाहिए अगर वह अपनी जन्म नियंत्रण की गोलियाँ लेना भूल जाती है? \n" , " यदि आप जन्म नियंत्रण की गोली लेना भूल जाती हैं, तो जैसे ही आपको याद हो, इसे लें। यदि आपको अगले दिन तक याद नहीं है, तो उस दिन दो गोलियां लेकर आगे बढ़ें। यदि आप दो दिनों के लिए अपनी गोलियां लेना भूल जाते हैं, तो दिन में दो गोलियां याद रखें और अगले दिन दो गोलियां लें। फिर आप समय पर वापस आ जाएंगे। यदि आप दो से अधिक गोलियां याद करते हैं, तो निर्देशों के लिए अपने स्वास्थ्य देखभाल प्रदाता को कॉल करें। उन निर्देशों को रविवार तक रोजाना एक गोली ले सकते हैं और फिर एक नया पैक शुरू कर सकते हैं या बाकी गोली पैक को छोड़ सकते हैं और उसी दिन एक नया पैक शुरू कर सकते हैं। \\ n \"+\n" +
                "                \"जब भी आप एक गोली लेना भूल जाते हैं, तो आपको गोली पैक खत्म करने तक एक और जन्म नियंत्रण का उपयोग करना चाहिए। जब \u200B\u200Bआप एक जन्म नियंत्रण गोली लेना भूल जाते हैं, तो आप अपने अंडाशय से एक अंडा जारी करने की संभावना बढ़ाते हैं। हालांकि, यदि आप 28-दिवसीय गोलियों में से अंतिम सात में से कोई भी लेना भूल जाते हैं, तो आप अपनी गर्भावस्था की संभावना नहीं बढ़ाएंगी, क्योंकि इन गोलियों में केवल निष्क्रिय तत्व होते हैं। यदि आप अपनी अवधि को याद करती हैं और एक या अधिक गोलियां लेना भूल जाती हैं, तो गर्भावस्था परीक्षण\n","Q17"));

         */


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        quesAnsAdapter = new QuesAnsAdapter(quesAnsList);
        recyclerView.setAdapter(quesAnsAdapter);
        return rootView;
    }
}