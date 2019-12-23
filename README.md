Kargo Takip
Java ile Nesne Yönelimli Programlama(OOP) kullanılmıştır.
Programdaki amaç, bu sisteme girildiğinde bir kargonun eklenmesi, personel girdiğinde bir kargo seçip yerini radio button ile seçmesi ve bunu sorguya yansıtabilmektir. Bunun yanı sıra personel, tüm müşterilerin bilgilerini ve tüm kargoların olduğu bilgileri jtable ile görebilir. 
Programda hem jdbc hemde entity bean olarak iki farklı yöntemle iki ayrı proje yapıldı.
Program nesneleri ve ilişkileri:
Giriş : Sisteme giriş kısmıdır. Hakkımızda bölümünde dosya okuma kullanıldı. Görüş ve önerilerinizde dosyaya yazma kullanıldı.
Personel Sayfası: Bu kısım panel ile ikiye ayrılıyor. Müşteri bilgileri kısmında müşterilerin bilgileri sıralanır ve dosyaya yazdır ile tablodaki veriler yazdırılır. Hareket ekle ile seçili id'deki kargonun radio button ile konumu belirlenir. Kaydettikten sonra hareketin durumu (nerede olduğu) ve tarihleri görülür. Takip2  ve Kargolar birbirine INNER JOIN ile birbirine bağlanmıştır.Ayrıca kargoda seçtikten sonra iptal butonuyla kargo silinebilir.
SorgulamaId : Kargonun id'si girilerek konumu ve girildiği tarih sorgulanır.

Veri Tabanında ise AlanKisi, GonderenKisi, Takip2 ve Kargolar bulunur.
AlanKisi  ve GonderenKisi: tc,ad,soyad,tel, adres tutar.
Takip2: Takip_2,Kargo_Id, durum ve tarih tutar.
Kargolar:KargoId,AlanTc,GonderenTc tutar.
