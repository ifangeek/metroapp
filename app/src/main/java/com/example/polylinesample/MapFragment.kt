package com.example.polylinesample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions

class MapFragment : Fragment(), OnMapReadyCallback {

    companion object {
        fun newInstance(): MapFragment = MapFragment()
    }

    private lateinit var map: GoogleMap


    private lateinit var naranjalMarker: MarkerOptions
    private lateinit var izaguirreMarker: MarkerOptions
    private lateinit var pacificoMarker: MarkerOptions
    private lateinit var independenciaMarker: MarkerOptions
    private lateinit var jazminesMarker: MarkerOptions
    private lateinit var tomasValleMarker: MarkerOptions
    private lateinit var elMilagroMarker: MarkerOptions
    private lateinit var honorioDelgadoMarker: MarkerOptions
    private lateinit var uniMarker: MarkerOptions
    private lateinit var parqueTrabajoMarker: MarkerOptions
    private lateinit var caquetaMarker: MarkerOptions
    private lateinit var dosDeMayoMarker: MarkerOptions
    private lateinit var quilcaMarker: MarkerOptions
    private lateinit var españaMarker: MarkerOptions
    private lateinit var estacionCentralMarker: MarkerOptions
    private lateinit var estadioNacionalMarker: MarkerOptions
    private lateinit var estacionMexicoMarker: MarkerOptions
    private lateinit var estacionCanadaMarker: MarkerOptions
    private lateinit var javierPradoMarker: MarkerOptions
    private lateinit var canavalYmoreiraMarker: MarkerOptions
    private lateinit var aramburuMarker: MarkerOptions
    private lateinit var domingoOreMarker: MarkerOptions
    private lateinit var angamosMarker: MarkerOptions
    private lateinit var ricardoPalmaMarker: MarkerOptions
    private lateinit var benavidesMarker: MarkerOptions
    private lateinit var estacion28JulioMarker: MarkerOptions
    private lateinit var plazaFloresMarker: MarkerOptions
    private lateinit var estacionBaltaMarker: MarkerOptions
    private lateinit var estadioUnionMarker: MarkerOptions
    private lateinit var escuelaMilitarMarker: MarkerOptions
    private lateinit var estacionTeranMarker: MarkerOptions
    private lateinit var plazaLimaSurMarker: MarkerOptions
    private lateinit var terminalMatellini: MarkerOptions

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_map, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        (childFragmentManager.findFragmentById(R.id.mapFrag) as SupportMapFragment?)?.let {
            it.getMapAsync(this)
        }

        initMarkers()
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        if (googleMap != null)
            googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL


        val permissions = arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION)
        ActivityCompat.requestPermissions(requireActivity(), permissions, 0)

        map = googleMap!!
        val googlePlex = CameraPosition.builder()
            .target(LatLng(-11.9827439, -77.058604))
            .zoom(15f)
            .bearing(-15f)
            .tilt(10f)
            .build()
        map.uiSettings.isMapToolbarEnabled = true
        map.isMyLocationEnabled = true

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(googlePlex), 1000, null)
        map.addMarker(naranjalMarker)
        map.addMarker(izaguirreMarker)
        map.addMarker(pacificoMarker)
        map.addMarker(independenciaMarker)
        map.addMarker(jazminesMarker)

        val rectOptions = PolylineOptions()
            .add(LatLng(-11.98293, -77.058553))
            .add(LatLng(-11.986206, -77.057595))
            .add(LatLng(-11.988757, -77.056952))
            .add(LatLng(-11.992172, -77.057232))
            .add(LatLng(-11.993008, -77.057116))
            .add(LatLng(-11.995496, -77.05564))
            .add(LatLng(-11.995879, -77.055445))
            .add(LatLng(-11.996547, -77.055292))
            .add(LatLng(-11.997721, -77.055303))
            .add(LatLng(-12.001484, -77.054904))
            .add(LatLng(-12.003879, -77.054516))
            .add(LatLng(-12.013166, -77.052536))
            .add(LatLng(-12.018019, -77.051399))
            .add(LatLng(-12.022307, -77.050648))
            .add(LatLng(-12.02264, -77.050528))
            .add(LatLng(-12.023067, -77.050231))
            .add(LatLng(-12.023431, -77.049884))
            .add(LatLng(-12.028297, -77.044433))
            .add(LatLng(-12.028504, -77.044341))
            .add(LatLng(-12.03305, -77.043941))
            .add(LatLng(-12.036043, -77.043685))
            .add(LatLng(-12.04285, -77.043088))
            .add(LatLng(-12.046648, -77.042741))
            .add(LatLng(-12.050348, -77.042426))
            .add(LatLng(-12.056063, -77.041915))
            .add(LatLng(-12.058029, -77.041762))
            .add(LatLng(-12.058149, -77.041694))
            .add(LatLng(-12.058123, -77.041206))
            .add(LatLng(-12.05788, -77.038255))
            .add(LatLng(-12.057905, -77.038092))
            .add(LatLng(-12.058045, -77.037831))
            .add(LatLng(-12.058083, -77.03765))
            .add(LatLng(-12.057977, -77.036313))
            .add(LatLng(-12.058673, -77.036176))
            .add(LatLng(-12.059026, -77.036101))
            .add(LatLng(-12.059423, -77.036083))
            .add(LatLng(-12.059957,-77.036025))
            .add(LatLng(-12.060091,-77.035993))
            .add(LatLng(-12.060585, -77.035683))
            .add(LatLng(-12.061146,-77.035156))


        // Get back the mutable Polyline
        map.addPolyline(rectOptions)
    }

    private fun initMarkers() {
        naranjalMarker =
            MarkerOptions().position(LatLng(-11.98293, -77.058553)).title("Estación Naranjal")
        izaguirreMarker =
            MarkerOptions().position(LatLng(-11.989548, -77.057016)).title("Estación Izaguirre")
        pacificoMarker =
            MarkerOptions().position(LatLng(-11.99488, -77.05599)).title("Estación Pacífico")
        independenciaMarker =
            MarkerOptions().position(LatLng(-11.998746, -77.055203)).title("Estación Independencia")
        jazminesMarker =
            MarkerOptions().position(LatLng(-12.001845, -77.054815)).title("Estacion Los Jazmines")
    }
}