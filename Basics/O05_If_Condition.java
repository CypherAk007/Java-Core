package Basics;

public class O05_If_Condition {
    public static void main(String[] args) {
        String url = "http://www.google.com";
        System.out.println(url.indexOf(':'));
        int colon = url.indexOf(':');
        String protocol = url.substring(0,colon);
        System.out.println(protocol);
        int orgIdx = url.lastIndexOf(".");
        System.out.println(orgIdx);
        String organization = url.substring(orgIdx+1);
        System.out.println(organization);
        String proto="";
        String org="";

        if (protocol.equals("http")){
            proto = "HyperTextTransferProtocol";
        }else if(protocol.equals("https")){
            proto = "HyperTextTransferProtocolSecure";
        }else if (protocol.equals("ftp")){
            proto = "FileTransferProtocol";
        }

        if (organization.equals("com")){
            org = "Commercial";
        }else if(organization.equals("org")){
            org = "Organization";
        }else if (organization.equals("net")){
            org = "Network";
        }

        System.out.println(proto+" "+org);


    }

}
